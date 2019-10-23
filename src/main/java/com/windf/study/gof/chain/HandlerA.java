package com.windf.study.gof.chain;

public class HandlerA extends AbstractHandler {

    @Override
    public void doHandler(String condition) {
        if ("A".equals(condition)) {
            System.out.println("HandlerA处理");
        } else {
            next(condition);
        }
    }
}
