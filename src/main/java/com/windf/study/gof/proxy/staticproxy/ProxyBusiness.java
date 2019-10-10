package com.windf.study.gof.proxy.staticproxy;

public class ProxyBusiness extends MainBusiness {

    private MainBusiness businessMan;

    public ProxyBusiness(MainBusiness businessMan) {
        this.businessMan = businessMan;
    }

    @Override
    public void work() {
        this.before();
        businessMan.work();
        this.after();
    }

    private void before() {
        System.out.println("工作之前，代理先做一些其他事前业务");
    }

    private void after() {
        System.out.println("工作之后，代理在做一些其他事后的业务");
    }
}
