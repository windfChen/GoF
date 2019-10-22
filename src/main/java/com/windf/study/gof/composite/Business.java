package com.windf.study.gof.composite;

public interface Business {
    void operation();
    void add(Business node);
    void remove(Business node);
    Business getChild(int i);
}
