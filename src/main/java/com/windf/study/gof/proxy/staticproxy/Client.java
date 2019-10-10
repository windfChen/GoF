package com.windf.study.gof.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        System.out.println("===业务类直接工作===");
        MainBusiness mainBusiness = new MainBusiness();
        mainBusiness.work();


        System.out.println("===代理业务类工作===");
        ProxyBusiness proxyBusiness = new ProxyBusiness(mainBusiness);
        proxyBusiness.work();
    }
}
