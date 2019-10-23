package com.windf.study.gof.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command> history = new ArrayList<>();

    public void invoker(Command command) {
        command.execute();
        history.add(command);
    }

    public void rollback() {
        Command command = history.remove(history.size() - 1);
        command.rollback();
    }
}
