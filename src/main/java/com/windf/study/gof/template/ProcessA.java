package com.windf.study.gof.template;

public class ProcessA extends AbstractProcess {

    @Override
    protected boolean conditionC() {
        return false;
    }

    @Override
    protected void dynamicTask() {
        System.out.println("ProcessA的动态条件");
    }
}
