package com.windf.study.gof.iterator;

public interface Iterator {
    Element first();
    Element next();
    boolean hasNext();
    Element currentItem();
}
