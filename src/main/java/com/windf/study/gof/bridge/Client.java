package com.windf.study.gof.bridge;

public class Client {
    public static void main(String[] args) {
        Product productAA = new ProductA();
        productAA.setAttribute(new AttributeA());
        System.out.println(productAA);

        Product productAB = new ProductA();
        productAB.setAttribute(new AttributeB());
        System.out.println(productAB);

        Product productBA = new ProductB();
        productBA.setAttribute(new AttributeA());
        System.out.println(productBA);
    }
}
