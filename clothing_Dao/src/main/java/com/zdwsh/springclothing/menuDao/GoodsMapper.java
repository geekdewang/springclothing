package com.zdwsh.springclothing.menuDao;


import com.zdwsh.springclothing.menu.Goods;

import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer gid);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    //根据sid展示其中类型的全部商品
    List<Goods> findBySid(int sid);
    //根据mid 展示商品详情
    Goods findByGid(int gid);
}