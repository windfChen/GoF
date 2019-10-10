package com.windf.study.gof.straregy;

public class Client {
    public static void main(String[] args) {
        new Business(new StrategyA()).doSomeThing();
        new Business(new StrategyB()).doSomeThing();
    }
}
