package com.windf.study.gof.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class MessageObserverA implements Observer {

    /**
     * 创建时添加到观察者，这个更具具体业务情况，也可以统一添加
     */
    public MessageObserverA() {
        MessageObservable.getInstance().addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println();
        System.out.println("------MessageObserverA 响应事件-------");
        System.out.print("事件发布者：");
        System.out.println(o);
        System.out.print("参数：");
        System.out.println(arg);
    }
}
