package com.windf.study.gof.builder;

public class ProductBuilder {

    private String info = "";

    public void stepA() {
        this.info += "A";
        System.out.println("前置步骤A");
    }

    public void stepB() {
        this.info += "B";
        System.out.println("前置步骤B");
    }

    public void stepC() {
        this.info += "C";
        System.out.println("前置步骤C");
    }

    public Product build() {
        return new Product(info);
    }
}
