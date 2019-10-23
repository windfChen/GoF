package com.windf.study.gof.chain;

public class HandlerB extends AbstractHandler {

    @Override
    public void doHandler(String condition) {
        if ("B".equals(condition)) {
            System.out.println("HandlerB处理");
        } else {
            next(condition);
        }
    }
}
