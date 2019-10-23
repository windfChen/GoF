package com.windf.study.gof.state;

public class StateB implements State {
    @Override
    public void doSomething(Context context) {
        System.out.println("StateB工作");
        context.switchState(new StateC());
    }
}
