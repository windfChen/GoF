package com.windf.study.gof.observer.guava;

import com.google.common.eventbus.EventBus;

public class Client {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();

        eventBus.register(new MessageObserverA());
        eventBus.register(new MessageObserverB());

        eventBus.post("消息");
    }
}
