package com.windf.study.gof.proxy.usedefineproxy;

public class MainBusiness implements BusinessSubject {
    @Override
    public void work() {
        System.out.println("业务对象正在工作");
    }
}
