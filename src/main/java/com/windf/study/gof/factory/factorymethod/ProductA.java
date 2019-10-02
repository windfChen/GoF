package com.windf.study.gof.factory.factorymethod;

public class ProductA implements Product {

    private String otherAttr;

    public ProductA(String otherAttr) {
        this.otherAttr = otherAttr;
        System.out.println("产品A被创建,制造商为：" + otherAttr);
    }

    @Override
    public void work() {
        System.out.println("产品A进入工厂：" + otherAttr + "，并且开始工作");
    }
}
