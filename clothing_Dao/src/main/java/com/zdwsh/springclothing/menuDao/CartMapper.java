package com.zdwsh.springclothing.menuDao;


import com.zdwsh.springclothing.menu.Cart;

import java.util.List;

public interface CartMapper {
    //通过id删除购物车商品
    int deleteByPrimaryKey(Integer cid);

    int insert(Cart record);

    //添加商品到购物车
    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    //展示购物车商品
    List<Cart> findAll();


}