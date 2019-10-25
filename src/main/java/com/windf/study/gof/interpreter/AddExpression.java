package com.windf.study.gof.interpreter;

public class AddExpression implements Expression {

    private Expression leftExpression;
    private Expression rightExpression;

    public AddExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpreter() {
        return leftExpression.interpreter() + rightExpression.interpreter();
    }
}
