package com.windf.study.gof.straregy;

public class StrategyA implements Strategy {
    @Override
    public void doStrategy() {
        System.out.println("使用策略A做事");
    }
}
