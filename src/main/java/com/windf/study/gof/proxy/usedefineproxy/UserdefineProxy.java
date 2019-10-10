package com.windf.study.gof.proxy.usedefineproxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UserdefineProxy {
    private static final String LN = "\r\n";
    private static final String TAB = "    ";

    private static int PROXY_NUMBER = 0;

    public static Object newProxyInstance(Class[] interfaces, InvocationHandler invocationHandler) throws IOException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        // 设置是生成的代理类名
        String proxyClassName = "$Proxy" + getAndAddProxyNumber();

        String javaSrc = generateJavaSrc(proxyClassName, interfaces);
        System.out.println(javaSrc);

        File javaFile = createJavaFile(proxyClassName, javaSrc);

        compilerJavaFile2ClassFile(javaFile);

        Class clazz = new UserdefineClassLoader().loadClass(proxyClassName);

        Object newInstance = createNewInstance(clazz, invocationHandler);

        // 删除生成的java文件
//        javaFile.delete();

        return newInstance;
    }

    private static Object createNewInstance(Class clazz, InvocationHandler invocationHandler) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Constructor constructor = clazz.getConstructor(InvocationHandler.class);
        return constructor.newInstance(invocationHandler);
    }


    private static void compilerJavaFile2ClassFile(File javaFile) throws IOException {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
        Iterable iterable = manager.getJavaFileObjects(javaFile);
        JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
        task.call();
        manager.close();
    }

    private static File createJavaFile(String proxyClassName, String javaSrc) throws IOException {
        String filePath = UserdefineProxy.class.getResource("").getPath();
        File javaFile = new File(filePath + proxyClassName + ".java");
        FileWriter fileWriter = new FileWriter(javaFile);
        fileWriter.write(javaSrc);
        fileWriter.flush();
        fileWriter.close();
        return javaFile;
    }

    /**
     * 获取java代码
     * @return
     */
    private static String generateJavaSrc(String proxyClassName, Class[] interfaces) {

        StringBuffer implementsInterface = new StringBuffer();
        for (Class clazz : interfaces) {
            if (implementsInterface.length() > 0) {
                implementsInterface.append(",");
            }
            implementsInterface.append(clazz.getName());
        }

        StringBuffer sb = new StringBuffer();
        sb.append("package com.windf.study.gof.proxy.usedefineproxy; " + LN);
        sb.append("" + LN);
        sb.append("import java.lang.reflect.Method;" + LN);
        sb.append("import java.lang.reflect.UndeclaredThrowableException;" + LN);
        sb.append("import java.lang.reflect.InvocationHandler;" + LN);
        sb.append("" + LN);
        sb.append("public class " + proxyClassName + " implements " + implementsInterface.toString() + " {" + LN);
        sb.append("" + LN);
        sb.append(TAB + "private InvocationHandler invocationHandler;" + LN);
        sb.append("" + LN);
        sb.append(TAB + "public " + proxyClassName + "(InvocationHandler invocationHandler) {" + LN);
        sb.append(TAB + TAB + "this.invocationHandler = invocationHandler;" + LN);
        sb.append(TAB + "}" + LN);
        for (Class clazz : interfaces) {
            for (Method method : clazz.getMethods()) {

                Class<?>[] params = method.getParameterTypes();

                StringBuffer paramNames = new StringBuffer();
                StringBuffer paramValues = new StringBuffer();
                StringBuffer paramClasses = new StringBuffer();

                for (int i = 0; i < params.length; i++) {
                    Class paramClazz = params[i];
                    String type = paramClazz.getName();
                    String paramName = toLowerFirstCase(paramClazz.getSimpleName());
                    paramNames.append(type + " " +  paramName);
                    paramValues.append(paramName);
                    paramClasses.append(paramClazz.getName() + ".class");
                    if(i > 0 && i < params.length-1){
                        paramNames.append(",");
                        paramClasses.append(",");
                        paramValues.append(",");
                    }
                }

                sb.append("" + LN);
                sb.append(TAB +  "@Override" + LN);
                sb.append(TAB +  "public final " + method.getReturnType().getName() + " " + method.getName() + "(" + paramNames.toString() + ") {" + LN);
                sb.append(TAB + TAB +  "try{" + LN);
                sb.append(TAB + TAB + TAB + "Method m = " + clazz.getName() + ".class.getMethod(\"" + method.getName() + "\", new Class[]{" + paramClasses.toString() + "});" + LN);
                sb.append(TAB + TAB + TAB);
                if (isVoidReturn(method.getReturnType())) {
                    sb.append("return ");
                }
                sb.append("this.invocationHandler.invoke(this, m, new Object[]{" + paramValues + "});" + LN);
                sb.append(TAB + TAB +  "} catch(Throwable e){" + LN);
                sb.append(TAB + TAB + TAB +  "throw new UndeclaredThrowableException(e);" + LN);
                sb.append(TAB + TAB +  "}" + LN);
                sb.append(TAB +  "}" + LN);
            }
        }
        sb.append("" + LN);
        sb.append("}" + LN);

        return sb.toString();
    }

    private static boolean isVoidReturn(Class clazz) {
        return clazz != void.class;
    }

    private static String toLowerFirstCase(String src){
        char [] chars = src.toCharArray();
        chars[0] += 32;
        return String.valueOf(chars);
    }

    private synchronized static int getAndAddProxyNumber() {
        return PROXY_NUMBER++;
    }
}
