package com.windf.study.gof.decorator;

public class Client {
    public static void main(String[] args) {
        /*
         * 做装饰
         */
        Business business = new BaseBusiness();
        business = new ExpansionBusinessA(business);
        business = new ExpansionBusinessA(business);
        business = new ExpansionBusinessB(business);

        business.doSomething();
    }
}
