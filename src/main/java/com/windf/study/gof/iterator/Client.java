package com.windf.study.gof.iterator;

public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new AggregateA();
        aggregate.addElement(new Element(1, "A"));
        aggregate.addElement(new Element(2, "B"));
        aggregate.addElement(new Element(3, "C"));
        aggregate.addElement(new Element(4, "D"));
        aggregate.addElement(new Element(5, "E"));

        Iterator iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            Element element = iterator.next();
            System.out.println(element);
        }
    }
}
