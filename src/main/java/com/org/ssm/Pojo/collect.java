package com.org.ssm.Pojo;

public class collect {
    private int cId;
    private int cUid;
    private int cGid;

    @Override
    public String toString() {
        return "collect{" +
                "cId=" + cId +
                ", cUid=" + cUid +
                ", cGid=" + cGid +
                '}';
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public int getcUid() {
        return cUid;
    }

    public void setcUid(int cUid) {
        this.cUid = cUid;
    }

    public int getcGid() {
        return cGid;
    }

    public void setcGid(int cGid) {
        this.cGid = cGid;
    }
}
