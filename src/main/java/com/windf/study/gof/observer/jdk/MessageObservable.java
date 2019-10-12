package com.windf.study.gof.observer.jdk;

import java.util.Observable;

public class MessageObservable extends Observable {

    private static final MessageObservable messageObservable = new MessageObservable();

    public static  MessageObservable getInstance() {
        return messageObservable;
    }

    public void triggerEvent() {
        System.out.println("发动事件MessageObservable");
        this.setChanged();
        this.notifyObservers("MessageObservable");
    }


}
