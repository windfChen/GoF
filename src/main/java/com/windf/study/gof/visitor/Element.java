package com.windf.study.gof.visitor;

public interface Element {
    String getName();
    void accept(Visitor visitor);
}
