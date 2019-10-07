package com.org.ssm.Service;

import com.org.ssm.Mapper.goodsMapper;
import com.org.ssm.Pojo.goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("goodsService")
public class goodsServiceImp implements goodsService {
    @Autowired
    goodsMapper goodsMapper;
    @Override
    public boolean addGoods(goods goods) {
        goodsMapper.addGoods(goods);
        return true;
    }

    @Override
    public List<goods> showAllGoods() {
        return goodsMapper.showAllGoods();
    }

    @Override
    public void delGoodById(int gId) {
        goodsMapper.delGoodById(gId);
    }

    @Override
    public goods showOneGoodsById(int gId) {
        return goodsMapper.showOneGoodsById(gId);
    }

    @Override
    public boolean updateGoodsById(goods goods) {
        goodsMapper.updateGoodsById(goods);
        return true;
    }
}
