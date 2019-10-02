package com.windf.study.gof.factory.abstractfactory;

public class Client {
    public static void main(String[] args) {
        FactoryController.getFactory("a").createProductA().workA();
        FactoryController.getFactory("a").createProductB().workB();
        FactoryController.getFactory("b").createProductB().workB();
        FactoryController.getFactory("b").createProductC().workC();
        FactoryController.getFactory("c").createProductC().workC();
        FactoryController.getFactory("c").createProductA().workA();
    }

}
