package com.windf.study.gof.memento;

public class Client {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Originator originator = new Originator(1);
        caretaker.setMemento(originator.save());
        System.out.println(originator);

        originator.setState(2);
        caretaker.setMemento(originator.save());
        System.out.println(originator);

        originator.setState(3);
        caretaker.setMemento(originator.save());
        System.out.println(originator);

        // 还原一次
        originator.restore(caretaker.getMemento());
        System.out.println(originator);

        // 还原一次
        originator.restore(caretaker.getMemento());
        System.out.println(originator);

    }
}
