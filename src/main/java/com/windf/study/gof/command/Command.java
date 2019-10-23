package com.windf.study.gof.command;

public interface Command {
    void execute();
    void rollback();
}
