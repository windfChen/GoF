package com.windf.study.gof.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorA implements Mediator {

    private List<Colleague> colleagues = new ArrayList<>();

    public void addColleague(Colleague colleague) {
        this.colleagues.add(colleague);
        tellAll(colleague);
    }

    private void tellAll(Colleague newColleague) {
        for (Colleague colleague : colleagues) {
            colleague.addNewColleague(newColleague);
        }
    }
}
