package com.windf.study.gof.chain;

public class Client {
    public static void main(String[] args) {
        AbstractHandler handlerA = new HandlerA();
        AbstractHandler handlerB = new HandlerB();
        AbstractHandler handlerC = new HandlerC();
        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);

        handlerA.doHandler("C");
        handlerA.doHandler("B");
    }
}
