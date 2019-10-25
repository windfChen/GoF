package com.windf.study.gof.interpreter;

public class NumberExpression implements Expression {

    private String num;

    public NumberExpression(String num) {
        this.num = num;
    }

    @Override
    public int interpreter() {
        return new Integer(num).intValue();
    }
}
