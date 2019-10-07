package com.org.ssm.Pojo;



public class user {




    private int uId;
    private String uNiCheng;
    private String uPassword;
    private String uSex;
    private String uQq;
    private String uImage;
    private String uRealName;
    private String uPostCode;
    private String uAddress;
    private String uTel;


    @Override
    public String toString() {
        return "user{" +
                "uId=" + uId +
                ", uNiCheng='" + uNiCheng + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", uSex='" + uSex + '\'' +
                ", uQq='" + uQq + '\'' +
                ", uImage='" + uImage + '\'' +
                ", uRealName='" + uRealName + '\'' +
                ", uPostCode='" + uPostCode + '\'' +
                ", uAddress='" + uAddress + '\'' +
                ", uTel='" + uTel + '\'' +
                '}';
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuNiCheng() {
        return uNiCheng;
    }

    public void setuNiCheng(String uNiCheng) {
        this.uNiCheng = uNiCheng;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex;
    }

    public String getuQq() {
        return uQq;
    }

    public void setuQq(String uQq) {
        this.uQq = uQq;
    }

    public String getuImage() {
        return uImage;
    }

    public void setuImage(String uImage) {
        this.uImage = uImage;
    }

    public String getuRealName() {
        return uRealName;
    }

    public void setuRealName(String uRealName) {
        this.uRealName = uRealName;
    }

    public String getuPostCode() {
        return uPostCode;
    }

    public void setuPostCode(String uPostCode) {
        this.uPostCode = uPostCode;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    public String getuTel() {
        return uTel;
    }

    public void setuTel(String uTel) {
        this.uTel = uTel;
    }
}
