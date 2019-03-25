package com.zdwsh.springclothing.provider.Controller;

import com.zdwsh.springclothing.user.User;
import com.zdwsh.springclothing.userService.UserService;
import com.zdwsh.springclothing.vo.ResultVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public ResultVo login(@RequestParam("phone") String phone, @RequestParam("password") String password){

        return userService.lgoin(phone,password);
    }

    @RequestMapping("register")
    public ResultVo regist(@RequestBody User user){

        return userService.regist(user);
    }
}
