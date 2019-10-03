package com.windf.study.gof.singleton.lazy;

public class SingleObject {
    private static SingleObject singleObject;

    public static SingleObject getInstance() {
        if (singleObject == null) {
            // 为了安全（使用synchronized）和效率（方法不完全串行）
            // 使用双层检测的方式，保证线程安全
            // 这样只有开始几次可能同步卡顿，初始化完成后，就不会再走synchronized了
            synchronized (SingleObject.class) {
                if (singleObject == null) {
                    singleObject = new SingleObject();
                }
            }
        }
        return singleObject;
    }

    private SingleObject() {
        System.out.println("单例对象正在初始化");
        if (singleObject != null) {
            throw new RuntimeException("单例模式只能被初始化一次");
        }
    }

    public void work() {
        System.out.println("单例模型正在工作");
    }

    /**
     * 防止反序列化攻击，序列化之后，会调用该方法验证，使用的是jdk的机制
     * @return
     */
    private Object readResolve () {
        return singleObject;
    }

}
