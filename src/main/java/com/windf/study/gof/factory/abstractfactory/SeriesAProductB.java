package com.windf.study.gof.factory.abstractfactory;

public class SeriesAProductB implements ProductB {
    @Override
    public void workB() {
        System.out.println("系列A的产品B在工作");
    }
}
