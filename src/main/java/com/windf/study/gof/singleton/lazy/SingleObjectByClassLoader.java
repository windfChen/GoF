package com.windf.study.gof.singleton.lazy;

public class SingleObjectByClassLoader {
    private static SingleObjectByClassLoader singleObject;

    public static SingleObjectByClassLoader getInstance() {
        return LazyLoader.instance; // l
    }

    private SingleObjectByClassLoader() {
        System.out.println("单例对象正在初始化");
        if (singleObject != null) {
            throw new RuntimeException("单例模式只能被初始化一次");
        }
    }

    /**
     * 防止反序列化攻击，序列化之后，会调用该方法验证，使用的是jdk的机制
     * @return
     */
    private Object readResolve () {
        return singleObject;
    }

    public void work() {
        System.out.println("单例模型正在工作");
    }

    private static class LazyLoader {
        private static SingleObjectByClassLoader instance = new SingleObjectByClassLoader();
    }

}
