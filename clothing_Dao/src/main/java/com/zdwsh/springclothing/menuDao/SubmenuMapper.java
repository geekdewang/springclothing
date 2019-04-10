package com.zdwsh.springclothing.menuDao;


import com.zdwsh.springclothing.menu.Submenu;

import java.util.List;

public interface SubmenuMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Submenu record);

    int insertSelective(Submenu record);

    Submenu selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Submenu record);

    int updateByPrimaryKey(Submenu record);

    List<Submenu> findByMid(int mid);
}