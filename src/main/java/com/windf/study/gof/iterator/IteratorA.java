package com.windf.study.gof.iterator;

import java.util.List;

public class IteratorA implements Iterator {

    private List<Element> elements;
    private int currentIndex = -1;

    public IteratorA(List<Element> elements) {
        this.elements = elements;
    }

    @Override
    public Element first() {
        currentIndex = -1;
        return next();
    }

    @Override
    public Element next() {
        currentIndex ++;
        return currentItem();
    }

    @Override
    public boolean hasNext() {
        return currentIndex + 1 < elements.size();
    }

    @Override
    public Element currentItem() {
        return elements.get(currentIndex);
    }
}
