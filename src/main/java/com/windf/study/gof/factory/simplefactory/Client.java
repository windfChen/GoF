package com.windf.study.gof.factory.simplefactory;

public class Client {
    public static void main(String[] args) {
        Factory.getInstence("A");
        Factory.getInstence("B");
    }
}
