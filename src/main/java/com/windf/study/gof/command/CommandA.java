package com.windf.study.gof.command;

public class CommandA implements Command {

    private ReceiverA receiverA = new ReceiverA();

    @Override
    public void execute() {
        receiverA.doSomethingA();
    }

    @Override
    public void rollback() {
        receiverA.unDoSomethingA();
    }
}
