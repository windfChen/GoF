package com.windf.study.gof.memento;

import java.util.Stack;

public class Caretaker {
    private Stack<Memento> mementos = new Stack<>();
    private Memento current;

    public void setMemento(Memento memento) {
        if (current != null) {
            mementos.push(current);
        }
        current = memento;
    }

    public Memento getMemento() {
        current = null;
        Memento memento = mementos.pop();
        return memento;
    }
}
