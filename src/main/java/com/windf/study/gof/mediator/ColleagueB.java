package com.windf.study.gof.mediator;

public class ColleagueB implements Colleague {

    private String name;

    public ColleagueB(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addNewColleague(Colleague colleague) {
        if (colleague != this) {
            System.out.println(this.getName() + "发现敌军：" + colleague.getName());
        }
    }
}
