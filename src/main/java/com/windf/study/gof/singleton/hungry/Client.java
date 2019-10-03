package com.windf.study.gof.singleton.hungry;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {
    public static void main(String[] args) {
        /*
         * 正常创建
         */
        SingleObject singleObjectA = SingleObject.getInstence();
        SingleObject singleObjectB = SingleObject.getInstence();
        System.out.println("A 和 B 是否为同一个对象：" + (singleObjectA == singleObjectB));

//        /*
//         * 反射攻击
//         */
//        try {
//            SingleObject singleObjectNormal = SingleObject.getInstence();
//            Constructor constructor = SingleObject.class.getDeclaredConstructor();
//            constructor.setAccessible(true);
//            SingleObject singleObjectByReflection = (SingleObject) constructor.newInstance();
//            System.out.println("反射出来的对象和正常创建的是否为一个：" + (singleObjectNormal == singleObjectByReflection));
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }

        /*
         * 序列化攻击
         */
        SingleObject singleObjectNormal = SingleObject.getInstence();
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(singleObjectNormal);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            SingleObject singleObjectBySerial = (SingleObject) ois.readObject();

            System.out.println("序列化回来的对象和正常创建的是否为一个：" + (singleObjectNormal == singleObjectBySerial));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
