package com.windf.study.gof.singleton.lazy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        /*
         * 多线程请下，请求
         */
        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new ClientThread());
        }

        for (int i = 0; i < list.size(); i++) {
            list.get(i).start();
        }
    }

    private static class ClientThread extends Thread {

        @Override
        public void run() {
            System.out.println("线程" + Thread.currentThread().getId() + "开始工作");
//            SingleObject.getInstance();   // 双重校验方式
            SingleObjectByClassLoader.getInstance();    // 内部类加载方式
            System.out.println("线程" + Thread.currentThread().getId() + "结束工作");
        }
    }
}
