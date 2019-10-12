package com.windf.study.gof.decorator;

public class ExpansionBusinessA implements Business {
    private Business business;

    public ExpansionBusinessA(Business business) {
        this.business = business;
    }

    @Override
    public void doSomething() {
        System.out.println("执行增强功能A");
        business.doSomething();
    }
}
