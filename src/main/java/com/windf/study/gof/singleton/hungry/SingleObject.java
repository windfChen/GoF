package com.windf.study.gof.singleton.hungry;

import java.io.Serializable;

public class SingleObject implements Serializable {

    private static final SingleObject singleObject = new SingleObject();

    public static SingleObject getInstence() {
        return singleObject;
    }

    private SingleObject() {
        System.out.println("singleObject 初始化");
        if (singleObject != null) {
            throw new RuntimeException("单例模式只能被初始化一次");
        }
    }

    public void work() {
        System.out.println("单例正在工作");
    }

    /**
     * 防止反序列化攻击，序列化之后，会调用该方法验证，使用的是jdk的机制
     * @return
     */
    private Object readResolve () {
        return singleObject;
    }
}
