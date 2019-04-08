package com.zdwsh.springclothing.menuDao;


import com.zdwsh.springclothing.menu.Cart;

public interface CartMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
}