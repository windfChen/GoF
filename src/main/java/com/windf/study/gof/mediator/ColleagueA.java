package com.windf.study.gof.mediator;

public class ColleagueA implements Colleague {

    private String name;

    public ColleagueA(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addNewColleague(Colleague colleague) {
        if (colleague != this) {
            System.out.println(this.getName() + "欢迎友军！" + colleague.getName());
        }
    }
}
