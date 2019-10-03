package com.windf.study.gof.singleton.lazy;

/**
 * 常亮本来就是一个
 * 自带单例，并且防止反射攻击和序列化攻击。
 * 但是枚举毕竟不是类，还是不要经常使用
 */
public enum SingleObjectByEnum {
    INSTANCE;


    public static final SingleObjectByEnum getInstance() {
        return INSTANCE;
    }

}
