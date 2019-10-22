package com.windf.study.gof.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static Map<String, Flyweight> flyweightMap = new HashMap<>();

    public static Flyweight getFlyweight(String key) {
        Flyweight flyweight = flyweightMap.get(key);
        if (flyweight == null) {
            flyweight = new FlyweightA(key);
            flyweightMap.put(key, flyweight);
        }
        return flyweight;
    }
}
