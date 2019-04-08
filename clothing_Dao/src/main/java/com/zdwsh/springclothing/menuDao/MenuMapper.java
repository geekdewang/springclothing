package com.zdwsh.springclothing.menuDao;


import com.zdwsh.springclothing.menu.Menu;

public interface MenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    //查询主页显示内容
    Menu selectAll();
}