package com.windf.study.gof.proxy.jdkdynamicproxy;

public class Client {
    public static void main(String[] args) {
        System.out.println("===业务类直接工作===");
        MainBusiness mainBusiness = new MainBusiness();
        mainBusiness.work();


        System.out.println("===代理业务类工作===");
        ProxyBusiness proxyBusiness = new ProxyBusiness();
        BusinessSubject businessSubject = (BusinessSubject) proxyBusiness.getInstance(mainBusiness);
        businessSubject.work();
    }
}
