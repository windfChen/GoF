package com.windf.study.gof.factory.factorymethod;

public class Client {
    public static void main(String[] args) {
        createProductAndWork("a");
        createProductAndWork("b");
    }

    private static void createProductAndWork(String type) {
        Factory factory = FactoryController.getFactory(type);
        Product product = factory.createProduct();
        product.work();
    }
}
