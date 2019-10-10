package com.windf.study.gof.proxy.usedefineproxy;

public class Client {
    public static void main(String[] args) {


        System.out.println("===代理业务类工作===");
        MainBusiness mainBusiness = new MainBusiness();
        ProxyBusiness proxyBusiness = new ProxyBusiness();
        BusinessSubject businessSubject = (BusinessSubject) proxyBusiness.getInstance(mainBusiness);
        businessSubject.work();
    }
}
