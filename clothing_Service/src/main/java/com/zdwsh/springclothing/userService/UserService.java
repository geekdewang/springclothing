package com.zdwsh.springclothing.userService;

import com.zdwsh.springclothing.user.User;
import com.zdwsh.springclothing.vo.ResultVo;

public interface UserService {

    ResultVo lgoin(String name, String password);
    ResultVo regist(User user);
    ResultVo findByPassword(String name);
}
