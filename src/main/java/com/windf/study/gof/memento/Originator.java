package com.windf.study.gof.memento;

public class Originator extends Memento {

    public Originator(int state) {
        super(state);
    }

    public Memento save() {
        return new Memento(this.getState());
    }

    public void restore(Memento memento) {
        this.setState(memento.getState());
    }

    @Override
    public String toString() {
        return "Originator{state:" + this.getState() + "}";
    }
}
