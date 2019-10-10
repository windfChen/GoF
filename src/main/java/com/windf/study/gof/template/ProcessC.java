package com.windf.study.gof.template;

public class ProcessC extends AbstractProcess {

    @Override
    protected boolean conditionC() {
        return true;
    }

    @Override
    protected void dynamicTask() {
        System.out.println("ProcessC的动态");
    }

    @Override
    protected void taskC() {
        System.out.println("ProcessC重写任务C");
    }

    @Override
    protected void taskD() {
        System.out.println("ProcessC实现条件D");
    }
}
