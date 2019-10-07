package com.org.ssm.Service;

import com.org.ssm.Pojo.shoppingCart;

import java.util.List;

public interface shoppingCartService {

    public boolean insertIntoShoppingCart(shoppingCart shoppingCart);
    public List<shoppingCart> showAllShoppingGoods();
    public void delShoppingGoodsByGid(int sGid);
}
