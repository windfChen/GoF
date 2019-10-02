package com.windf.study.gof.factory.factorymethod;

/**
 * 这里只有ABC不一样，可以使用配置文件和反射，简单工程不行，因为创建过程可能很复杂，不能统一处理
 * 具体的创建过程，写到工厂方法中了
 */
public class FactoryController {
    public static Factory getFactory(String type) {
        Factory factory = null;
        switch (type) {
            case "a":
                factory = new ProductAFactory();
                break;
            case "b":
                factory = new ProductBFactory();
                break;
        }
        return factory;
    }
}
