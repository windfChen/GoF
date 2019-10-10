package com.windf.study.gof.delegate;

public class BusinessB1 implements Business {
    @Override
    public void doSomeThing(String arg1, int arg2) {
        System.out.println("处理B类型种类1的资源");
    }
}
