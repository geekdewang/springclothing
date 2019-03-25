package com.zdwsh.springclothing.userDao;


import com.zdwsh.springclothing.user.User;

public interface UserMapper {

    User selectByPrimaryKey(Integer id);

    User findByName(String phone);

    int insert(User user);
}