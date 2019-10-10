package com.windf.study.gof.proxy.jdkdynamicproxy;

public class MainBusiness implements BusinessSubject {
    @Override
    public void work() {
        System.out.println("业务对象正在工作");
    }
}
