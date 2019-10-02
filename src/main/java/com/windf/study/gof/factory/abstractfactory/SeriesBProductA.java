package com.windf.study.gof.factory.abstractfactory;

public class SeriesBProductA implements ProductA {
    @Override
    public void workA() {
        System.out.println("系列B的产品A在工作");
    }
}
