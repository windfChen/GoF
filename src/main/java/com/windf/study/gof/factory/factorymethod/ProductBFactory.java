package com.windf.study.gof.factory.factorymethod;

public class ProductBFactory implements Factory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
