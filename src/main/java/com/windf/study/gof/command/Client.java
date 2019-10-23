package com.windf.study.gof.command;

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.invoker(new CommandA());
        invoker.invoker(new CommandB());
        invoker.invoker(new CommandB());
        invoker.invoker(new CommandA());
        invoker.rollback();
        invoker.rollback();
    }
}
