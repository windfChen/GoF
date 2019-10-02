package com.windf.study.gof.factory.simplefactory;

public class Factory {
    public static Product getInstence(String type) {
        Product product = null;
        switch (type) {
            case "A":
                product = new ProductA();
                break;
            case "B":
                product = new ProductB();
                break;
        }
        return product;
    }
}
