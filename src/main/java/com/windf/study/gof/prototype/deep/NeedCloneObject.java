package com.windf.study.gof.prototype.deep;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NeedCloneObject implements Cloneable, Serializable {
    private String data;
    private List<String> attrs = new ArrayList<>();

    @Override
    public NeedCloneObject clone() {
        NeedCloneObject needCloneObject = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream bis = new ObjectInputStream(bais);
            needCloneObject = (NeedCloneObject) bis.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return needCloneObject;

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
