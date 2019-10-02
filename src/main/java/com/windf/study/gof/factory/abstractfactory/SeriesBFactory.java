package com.windf.study.gof.factory.abstractfactory;

public class SeriesBFactory implements Factory {
    @Override
    public ProductA createProductA() {
        return new SeriesBProductA();
    }

    @Override
    public ProductB createProductB() {
        return new SeriesBProductB();
    }

    @Override
    public ProductC createProductC() {
        return new SeriesBProductC();
    }
}
