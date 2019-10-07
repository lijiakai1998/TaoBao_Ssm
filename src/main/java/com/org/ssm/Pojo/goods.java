package com.org.ssm.Pojo;

public class goods {
    private int gId;
    private String gName;
    private Double gPrice;
    private String gStore;//商家
    private int gPageView;
    private String gImage;

    @Override
    public String toString() {
        return "goods{" +
                "gId=" + gId +
                ", gName='" + gName + '\'' +
                ", gPrice=" + gPrice +
                ", gStore='" + gStore + '\'' +
                ", gPageView=" + gPageView +
                ", gImage='" + gImage + '\'' +
                '}';
    }

    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public Double getgPrice() {
        return gPrice;
    }

    public void setgPrice(Double gPrice) {
        this.gPrice = gPrice;
    }

    public String getgStore() {
        return gStore;
    }

    public void setgStore(String gStore) {
        this.gStore = gStore;
    }

    public int getgPageView() {
        return gPageView;
    }

    public void setgPageView(int gPageView) {
        this.gPageView = gPageView;
    }

    public String getgImage() {
        return gImage;
    }

    public void setgImage(String gImage) {
        this.gImage = gImage;
    }

/*
* 重新编写equal方法,在ArrayList去重时都是调用底层equals方法
* */
   @Override
    public boolean equals(Object object)
    {
        goods goods=(com.org.ssm.Pojo.goods)object;
        return this.gId==goods.gId &&
                this.gImage.equals(goods.gImage) && this.gName.equals(goods.gName) &&
                this.gPageView == goods.gPageView && this.gPrice.equals(goods.gPrice )&&
                this.gStore.equals(goods.gStore);
    }
}
