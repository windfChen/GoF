package com.windf.study.gof.decorator;

public class BaseBusiness implements Business {
    @Override
    public void doSomething() {
        System.out.println("执行基本的功能");
    }
}
