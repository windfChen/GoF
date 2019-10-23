package com.windf.study.gof.state;

public class StateA implements State {
    @Override
    public void doSomething(Context context) {
        System.out.println("StateA工作");
        context.switchState(new StateB());
    }
}
