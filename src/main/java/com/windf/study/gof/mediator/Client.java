package com.windf.study.gof.mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new MediatorA();
        mediator.addColleague(new ColleagueA("刘备"));
        mediator.addColleague(new ColleagueB("唐僧"));
        mediator.addColleague(new ColleagueA("关羽"));
        mediator.addColleague(new ColleagueB("猪八戒"));
        mediator.addColleague(new ColleagueA("张飞"));
        mediator.addColleague(new ColleagueA("赵云"));
        mediator.addColleague(new ColleagueB("孙悟空"));
        mediator.addColleague(new ColleagueB("沙和尚"));
    }
}
