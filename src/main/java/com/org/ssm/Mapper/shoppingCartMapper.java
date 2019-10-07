package com.org.ssm.Mapper;

import com.org.ssm.Pojo.shoppingCart;

import java.util.List;

public interface shoppingCartMapper {
    public void insertIntoShoppingCart(shoppingCart shoppingCart);
    public List<shoppingCart> showAllShoppingGoods();
    public void delShoppingGoodsByGid(int sGid);

  }
