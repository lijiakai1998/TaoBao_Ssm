package com.org.ssm.Service;

import com.org.ssm.Pojo.goods;

import java.util.List;

public interface goodsService {
    public boolean  addGoods(goods goods);
    public List<goods> showAllGoods();
    public void delGoodById(int gId);
    public goods showOneGoodsById(int gId);
    public boolean updateGoodsById(goods goods);
}
