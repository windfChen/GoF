package com.windf.study.gof.visitor;

public class ElementA implements Element {
    @Override
    public String getName() {
        return "1";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitorA(this);
    }
}
