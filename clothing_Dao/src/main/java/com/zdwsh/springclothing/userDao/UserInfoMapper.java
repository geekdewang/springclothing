package com.zdwsh.springclothing.userDao;


import com.zdwsh.springclothing.user.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    //修改用户详细信息
    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    //根据uid查询用户的详细信息
    UserInfo findByUid(int uid);




}