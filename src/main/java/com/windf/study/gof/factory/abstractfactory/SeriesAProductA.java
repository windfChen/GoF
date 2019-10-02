package com.windf.study.gof.factory.abstractfactory;

import com.windf.study.gof.factory.factorymethod.Product;

public class SeriesAProductA implements ProductA {
    @Override
    public void workA() {
        System.out.println("系列A的产品A在工作");
    }
}
