package com.windf.study.gof.adapter;

public class Adapter implements New {

    private Old old;

    public Adapter(Old old) {
        this.old = old;
    }

    @Override
    public double newOption() {
        System.out.println("参数适配");
        System.out.println("逻辑适配");

        int ret = old.oldOption();

        System.out.println("返回值适配");

        return new Integer(ret).doubleValue();
    }
}
