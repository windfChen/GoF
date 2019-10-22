package com.windf.study.gof.facade;

public class Facade {
    public void doSomething() {
        new BussinessA().doSomethingA();
        BussinessB bussinessB = new BussinessB();
        bussinessB.doSomethingB();
        bussinessB.doSomethingB1();
        new BussinessC().doSomethingC();
    }
}
