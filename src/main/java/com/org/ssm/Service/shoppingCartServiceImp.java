package com.org.ssm.Service;

import com.org.ssm.Mapper.shoppingCartMapper;
import com.org.ssm.Pojo.shoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("shoppingCartService")
public class shoppingCartServiceImp implements shoppingCartService {
   @Autowired
    shoppingCartMapper  shoppingCartMapper;
    @Override
    public boolean insertIntoShoppingCart(shoppingCart shoppingCart) {
        shoppingCartMapper.insertIntoShoppingCart(shoppingCart);
        return true;
    }

    @Override
    public List<shoppingCart> showAllShoppingGoods() {
        return shoppingCartMapper.showAllShoppingGoods();
    }

    @Override
    public void delShoppingGoodsByGid(int sGid) {
        shoppingCartMapper.delShoppingGoodsByGid(sGid);
    }
}
