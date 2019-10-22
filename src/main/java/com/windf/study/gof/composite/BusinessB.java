package com.windf.study.gof.composite;

public class BusinessB implements Business {

    private String name;

    public BusinessB(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("我是B:" + this.name);
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
