package com.windf.study.gof.iterator;

import java.util.ArrayList;
import java.util.List;

public class AggregateA implements Aggregate {

    private List<Element> elementList = new ArrayList<>();

    @Override
    public void addElement(Element element) {
        elementList.add(element);
    }

    @Override
    public Iterator createIterator() {
        return new IteratorA(elementList);
    }
}
