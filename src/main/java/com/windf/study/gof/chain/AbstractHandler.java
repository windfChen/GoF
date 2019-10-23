package com.windf.study.gof.chain;

public abstract class AbstractHandler {
    private AbstractHandler nextHandler;

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected void next(String condition) {
        nextHandler.doHandler(condition);
    }

    public abstract void doHandler(String condition);
}
