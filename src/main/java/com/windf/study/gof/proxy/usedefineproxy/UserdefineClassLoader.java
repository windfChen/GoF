package com.windf.study.gof.proxy.usedefineproxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

public class UserdefineClassLoader extends ClassLoader {

    private File classPathFile;

    public UserdefineClassLoader(){
        String classPath = UserdefineClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }

    public Class loadClass(String classSimpleName) {
        String className = UserdefineProxy.class.getPackage().getName() + "." + classSimpleName;

        File classFile = new File(classPathFile,classSimpleName.replaceAll("\\.","/") + ".class");
        if(classFile.exists()){
            FileInputStream in = null;
            ByteArrayOutputStream out = null;
            try{
                in = new FileInputStream(classFile);
                out = new ByteArrayOutputStream();
                byte [] buff = new byte[1024];
                int len;
                while ((len = in.read(buff)) != -1){
                    out.write(buff,0,len);
                }
                return defineClass(className, out.toByteArray(),0,out.size());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }
}
