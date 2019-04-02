package com.zdwsh.springclothing.controller.UserController;

import com.zdwsh.springclothing.controller.Service.UserService;
import com.zdwsh.springclothing.user.User;
import com.zdwsh.springclothing.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "登陆注册相关操作")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("login")
    @ApiOperation(value = "用户登录",notes = "用户登录")
    public ResultVo login(@ApiParam(value = "用户账号（手机号）") @RequestParam(value = "phone") String phone,@ApiParam(value = "密码") @RequestParam(value = "password")String passsword){
        ResultVo resultVo = userService.login(phone,passsword);
        return resultVo;
    }
    @PostMapping("register")
    @ApiOperation(value = "新增用户",notes = "注册新用户")
    public ResultVo regist(@ApiParam(value = "用户对象") @RequestBody User user){

        return userService.regist(user);
    }
    @PostMapping("findByPassword")
    @ApiOperation(value = "找回密码",notes = "通过用户找回密码")
    public ResultVo findByPassword(@RequestParam("phone") String phone){

        return userService.findByPassword(phone);
    }
}
