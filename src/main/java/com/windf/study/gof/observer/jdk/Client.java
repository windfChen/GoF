package com.windf.study.gof.observer.jdk;

public class Client {
    public static void main(String[] args) {
        MessageObservable messageObservable = MessageObservable.getInstance();

        MessageObserverA messageObserverA = new MessageObserverA();
        MessageObserverB messageObserverB = new MessageObserverB();

        messageObservable.triggerEvent();
    }
}
