package com.windf.study.gof.visitor;

public class Client {
    public static void main(String[] args) {
        ElementClass elementClass = new ElementClass();
        elementClass.addElement(new ElementA());
        elementClass.addElement(new ElementB());

        elementClass.accept(new VisitorA());
        elementClass.accept(new VisitorB());
    }
}
