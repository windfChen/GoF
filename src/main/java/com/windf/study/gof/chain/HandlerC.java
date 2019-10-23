package com.windf.study.gof.chain;

public class HandlerC extends AbstractHandler {

    @Override
    public void doHandler(String condition) {
        System.out.println("剩下的都是HandlerC处理");
    }
}
