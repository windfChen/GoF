package com.windf.study.gof.iterator;

public interface Aggregate {
    Iterator createIterator();
    void addElement(Element element);
}
