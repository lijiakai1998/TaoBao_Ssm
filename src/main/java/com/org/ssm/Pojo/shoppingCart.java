package com.org.ssm.Pojo;

public class shoppingCart {
    private int sId;
    private int sUid;
    private int sGid;

    @Override
    public String toString() {
        return "shoppingCart{" +
                "sId=" + sId +
                ", sUid=" + sUid +
                ", sGid=" + sGid +
                '}';
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public int getsUid() {
        return sUid;
    }

    public void setsUid(int sUid) {
        this.sUid = sUid;
    }

    public int getsGid() {
        return sGid;
    }

    public void setsGid(int sGid) {
        this.sGid = sGid;
    }
}
