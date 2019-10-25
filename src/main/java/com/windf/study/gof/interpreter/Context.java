package com.windf.study.gof.interpreter;

import java.util.Stack;

public class Context {
    private String expression;

    public int handle(String expression) {
        String[] words = expression.split(" ");
        Stack<Expression> stack = new Stack<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if ("+".equals(word)) {
                Expression value = new AddExpression(stack.pop(), new NumberExpression(words[++i]));
                stack.push(value);
            } else if ("-".equals(word)) {
                Expression value = new SubExpression(stack.pop(), new NumberExpression(words[++i]));
                stack.push(value);
            } else {
                stack.push(new NumberExpression(word));
            }
        }

        return stack.pop().interpreter();
    }
}
