package com.windf.study.gof.factory.factorymethod;

public class ProductAFactory implements Factory {
    @Override
    public Product createProduct() {
        return new ProductA("华强北");
    }
}
