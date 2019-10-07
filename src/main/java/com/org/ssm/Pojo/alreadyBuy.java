package com.org.ssm.Pojo;

public class alreadyBuy {
    private int aId;
    private int aUid;
    private int aGid;
    private String aAppraise;//评价
    private String aTime;

    public String getaTime() {
        return aTime;
    }

    public void setaTime(String aTime) {
        this.aTime = aTime;
    }


    @Override
    public String toString() {
        return "alreadyBuy{" +
                "aId=" + aId +
                ", aUid=" + aUid +
                ", aGid=" + aGid +
                ", aAppraise='" + aAppraise + '\'' +
                ", aTime='" + aTime + '\'' +
                '}';
    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public int getaUid() {
        return aUid;
    }

    public void setaUid(int aUid) {
        this.aUid = aUid;
    }

    public int getaGid() {
        return aGid;
    }

    public void setaGid(int aGid) {
        this.aGid = aGid;
    }

    public String getaAppraise() {
        return aAppraise;
    }

    public void setaAppraise(String aAppraise) {
        this.aAppraise = aAppraise;
    }
}
