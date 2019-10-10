package com.windf.study.gof.straregy;

/**
 * 这里可以透明化策略的选择，更具一些固定参数判断策略的选择
 */
public class Business {

    private Strategy strategy;

    public Business(Strategy strategy) {
        this.strategy = strategy;
    }

    void doSomeThing() {
        strategy.doStrategy();
    }
}
