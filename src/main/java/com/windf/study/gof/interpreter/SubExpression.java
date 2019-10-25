package com.windf.study.gof.interpreter;

public class SubExpression implements Expression {

    private Expression leftExpression;
    private Expression rightExpression;

    public SubExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpreter() {
        return leftExpression.interpreter() - rightExpression.interpreter();
    }
}
