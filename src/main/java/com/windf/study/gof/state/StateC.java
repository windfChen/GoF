package com.windf.study.gof.state;

public class StateC implements State {
    @Override
    public void doSomething(Context context) {
        System.out.println("StateC工作");
        context.switchState(new StateA());
    }
}
