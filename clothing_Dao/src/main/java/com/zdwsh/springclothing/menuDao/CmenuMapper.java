package com.zdwsh.springclothing.menuDao;


import com.zdwsh.springclothing.menu.Cmenu;

public interface CmenuMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(Cmenu record);

    int insertSelective(Cmenu record);

    Cmenu selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Cmenu record);

    int updateByPrimaryKey(Cmenu record);
}