package com.windf.study.gof.bridge;

public abstract class Product {
    private Attribute attribute;

    public abstract String getName();

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return "我是" + this.getName() + "，我有属性" + attribute.getName();
    }
}
