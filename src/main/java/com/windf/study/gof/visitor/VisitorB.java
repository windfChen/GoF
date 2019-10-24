package com.windf.study.gof.visitor;

public class VisitorB implements Visitor {
    @Override
    public void visitorA(Element element) {
        System.out.println("用访问者B的方式访问元素A：" + element.getName());
    }

    @Override
    public void visitorB(Element element) {
        System.out.println("用访问者B的方式访问元素B：" + element.getName());
    }
}
