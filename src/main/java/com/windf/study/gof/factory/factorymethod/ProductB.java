package com.windf.study.gof.factory.factorymethod;

public class ProductB implements Product {
    public ProductB() {
        System.out.println("产品B被创建");
    }

    @Override
    public void work() {
        System.out.println("产品B开始工作");
    }
}
