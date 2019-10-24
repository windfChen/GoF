package com.windf.study.gof.visitor;

public class ElementB implements Element {
    @Override
    public String getName() {
        return "2";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitorB(this);
    }
}
