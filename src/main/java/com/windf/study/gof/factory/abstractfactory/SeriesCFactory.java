package com.windf.study.gof.factory.abstractfactory;

public class SeriesCFactory implements Factory {
    @Override
    public ProductA createProductA() {
        return new SeriesCProductA();
    }

    @Override
    public ProductB createProductB() {
        return new SeriesCProductB();
    }

    @Override
    public ProductC createProductC() {
        return new SeriesCProductC();
    }
}
