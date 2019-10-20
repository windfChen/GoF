package com.windf.study.gof.builder;

public class Product {

    private String info;

    public Product(String info) {
        System.out.println("产品被创建," + info);
    }
}
