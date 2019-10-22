package com.windf.study.gof.flyweight;

public class Client {
    public static void main(String[] args) {
        Flyweight flyweightA = FlyweightFactory.getFlyweight("123");
        Flyweight flyweightB = FlyweightFactory.getFlyweight("123");
        Flyweight flyweightC = FlyweightFactory.getFlyweight("456");

        flyweightA.doSomething();
        flyweightB.doSomething();
        flyweightC.doSomething();

        System.out.println("flyweightA和flyweightB是否是一个:" + (flyweightA == flyweightB));
        System.out.println("flyweightA和flyweightC是否是一个:" + (flyweightA == flyweightC));

    }
}
