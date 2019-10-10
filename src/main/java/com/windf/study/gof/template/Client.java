package com.windf.study.gof.template;

public class Client {
    public static void main(String[] args) {
        AbstractProcess process = null;

        System.out.println("===流程A=start==");
        process = new ProcessA();
        process.doSomeThing();
        System.out.println("===流程A=end==");

        System.out.println("===流程B=start==");
        process = new ProcessB();
        process.doSomeThing();
        System.out.println("===流程B=end==");

        System.out.println("===流程C=start==");
        process = new ProcessC();
        process.doSomeThing();
        System.out.println("===流程C=end==");
    }
}
