package com.windf.study.gof.template;

public class ProcessB extends AbstractProcess {

    @Override
    protected boolean conditionC() {
        return false;
    }

    @Override
    protected void dynamicTask() {
        System.out.println("无动态条件");
    }
}
