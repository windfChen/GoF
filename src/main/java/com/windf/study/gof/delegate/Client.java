package com.windf.study.gof.delegate;

public class Client {
    public static void main(String[] args) {
        Business business = new Delegate();

        business.doSomeThing("A", 4);
        business.doSomeThing("B", 1);
        business.doSomeThing("B", 2);
        business.doSomeThing("C", 3);
    }
}
