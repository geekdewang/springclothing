package com.zdwsh.springclothing.controller.UserController;

import com.zdwsh.springclothing.controller.Service.UserService;
import com.zdwsh.springclothing.user.User;
import com.zdwsh.springclothing.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public ResultVo login(@RequestParam(value = "phone") String phone, @RequestParam(value = "password")String passsword){
        ResultVo resultVo = userService.login(phone,passsword);
        return resultVo;
    }
    @RequestMapping("register")
    public ResultVo regist(@RequestBody User user){

        return userService.regist(user);
    }
}
