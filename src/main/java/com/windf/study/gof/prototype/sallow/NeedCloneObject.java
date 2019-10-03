package com.windf.study.gof.prototype.sallow;

import java.util.ArrayList;
import java.util.List;

public class NeedCloneObject implements Cloneable {
    private String data;
    private List<String> attrs = new ArrayList<>();

    @Override
    public NeedCloneObject clone() throws CloneNotSupportedException {
        return (NeedCloneObject) super.clone();
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<String> getAttrs() {
        return this.attrs;
    }

    public void setAttrs(List<String> attr) {
        this.attrs = attr;
    }
}
