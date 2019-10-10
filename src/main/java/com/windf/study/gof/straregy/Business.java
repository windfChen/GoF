package com.windf.study.gof.straregy;

public class Business {

    private Strategy strategy;

    public Business(Strategy strategy) {
        this.strategy = strategy;
    }

    void doSomeThing() {
        strategy.doStrategy();
    }
}
