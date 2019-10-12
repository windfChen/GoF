package com.windf.study.gof.decorator;

public class ExpansionBusinessB implements Business {
    private Business business;

    public ExpansionBusinessB(Business business) {
        this.business = business;
    }

    @Override
    public void doSomething() {
        business.doSomething();
        System.out.println("执行增强功能B");
    }
}
