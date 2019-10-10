package com.windf.study.gof.delegate;

public class BusinessA implements Business {
    @Override
    public void doSomeThing(String arg1, int arg2) {
        System.out.println("处理A类型的资源");
    }
}
