package com.windf.study.gof.prototype.sallow;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        NeedCloneObject needCloneObject = new NeedCloneObject();
        needCloneObject.setData("a");

        NeedCloneObject clonedObject = needCloneObject.clone();
        System.out.println("对象的基本类型比较：" + (needCloneObject.getData().equals(clonedObject.getData())));
        System.out.println("对象的引用类型比较：" + (needCloneObject.getAttrs() == clonedObject.getAttrs()));
    }
}
