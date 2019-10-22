package com.windf.study.gof.composite;

public class Client {
    public static void main(String[] args) {
        Business root = new BusinessComposite();
        root.add(new BusinessA("孙悟空"));
        root.add(new BusinessA("猪八戒"));
        root.add(new BusinessB("诸葛亮"));
        Business node1 = new BusinessComposite();
        root.add(node1);
        node1.add(new BusinessA("沙僧"));
        node1.add(new BusinessB("刘备"));

        root.operation();
    }
}
