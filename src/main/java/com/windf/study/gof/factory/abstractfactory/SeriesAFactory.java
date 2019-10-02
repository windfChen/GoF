package com.windf.study.gof.factory.abstractfactory;

public class SeriesAFactory implements Factory {
    @Override
    public ProductA createProductA() {
        return new SeriesAProductA();
    }

    @Override
    public ProductB createProductB() {
        return new SeriesAProductB();
    }

    @Override
    public ProductC createProductC() {
        return new SeriesAProductC();
    }
}
