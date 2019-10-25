package com.windf.study.gof.interpreter;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        System.out.println(context.handle("1 - 2 + 5 + 10"));
        System.out.println(context.handle("10 - 2 - 4 - 9"));
    }
}
