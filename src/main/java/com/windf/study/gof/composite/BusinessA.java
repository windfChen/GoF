package com.windf.study.gof.composite;

public class BusinessA implements Business {

    private String name;

    public BusinessA(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("我是A:" + this.name);
    }

    @Override
    public void add(Business node) {

    }

    @Override
    public void remove(Business node) {

    }

    @Override
    public Business getChild(int i) {
        return null;
    }
}
