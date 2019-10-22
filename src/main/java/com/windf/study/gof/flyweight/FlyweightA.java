package com.windf.study.gof.flyweight;

public class FlyweightA implements Flyweight {

    private String key;

    public FlyweightA(String key) {
        this.key = key;
    }

    @Override
    public void doSomething() {
        System.out.println("我是FlyweightA，key是：" + key);
    }
}
