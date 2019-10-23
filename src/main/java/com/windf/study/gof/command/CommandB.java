package com.windf.study.gof.command;

public class CommandB implements Command {

    private ReceiverB receiverB = new ReceiverB();

    @Override
    public void execute() {
        receiverB.doSomethingB();
    }

    @Override
    public void rollback() {
        receiverB.unDoSomethingB();
    }
}
