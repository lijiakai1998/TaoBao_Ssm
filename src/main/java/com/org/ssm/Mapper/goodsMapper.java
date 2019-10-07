package com.org.ssm.Mapper;

import com.org.ssm.Pojo.goods;

import java.util.List;

public interface goodsMapper {
    public void addGoods(goods goods);
    public List<goods> showAllGoods();
    public void delGoodById(int gId);
    public goods showOneGoodsById(int gId);
    public void updateGoodsById(goods goods);
}
