package com.windf.study.gof.state;

public class Context {

    private State state;

    public Context() {
        state = new StateA();
    }

    public void switchState(State state) {
        this.state = state;
    }

    public void handle() {
        state.doSomething(this);
    }

}
