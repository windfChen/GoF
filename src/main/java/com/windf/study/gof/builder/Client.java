package com.windf.study.gof.builder;

public class Client {
    public static void main(String[] args) {
        ProductBuilder productBuilder = new ProductBuilder();
        productBuilder.stepA();
        productBuilder.stepC();
        productBuilder.stepB();
        productBuilder.build();
    }
}
