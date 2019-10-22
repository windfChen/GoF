package com.windf.study.gof.composite;

import java.util.ArrayList;
import java.util.List;

public class BusinessComposite implements Business {

    private List<Business> businessList = new ArrayList<>();

    @Override
    public void operation() {
        for (Business business : businessList) {
            business.operation();
        }
    }

    @Override
    public void add(Business node) {
        businessList.add(node);
    }

    @Override
    public void remove(Business node) {
        businessList.remove(node);
    }

    @Override
    public Business getChild(int i) {
        return businessList.get(i);
    }
}
