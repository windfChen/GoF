package com.windf.study.gof.template;

public abstract class AbstractProcess {


    public void doSomeThing() {
        taskA();
        taskB();

        if (conditionC()) {
            taskC();
        }

        dynamicTask();

        taskD();

    }

    protected abstract boolean conditionC();

    protected abstract void dynamicTask();

    private void taskA() {
        System.out.println("执行任务A");
    }

    private void taskB() {
        System.out.println("执行任务B");
    }

    protected void taskC() {
        System.out.println("执行任务C");
    }

    protected void taskD() {

    }
}
