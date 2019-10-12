package com.windf.study.gof.observer.guava;

import com.google.common.eventbus.Subscribe;
import com.windf.study.gof.observer.jdk.MessageObservable;

import java.util.Observable;
import java.util.Observer;

public class MessageObserverB {

    @Subscribe
    public void update(Object arg) {
        System.out.println();
        System.out.println("------MessageObserverA 响应事件-------");
        System.out.print("参数：");
        System.out.println(arg);
    }
}
