package com.windf.study.gof.visitor;

import java.util.ArrayList;
import java.util.List;

public class ElementClass implements Element {

    private List<Element> elements = new ArrayList<>();

    public void addElement(Element element) {
        elements.add(element);
    }

    @Override
    public String getName() {
        return "元素集合";
    }

    @Override
    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
