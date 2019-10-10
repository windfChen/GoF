package com.windf.study.gof.adapter;

public class Client {
    public static void main(String[] args) {
        Old old = new Old();

        New n = new Adapter(old);
        n.newOption();
    }
}
