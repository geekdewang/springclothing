package com.zdwsh.springclothing.controller.UserController;

import com.zdwsh.springclothing.controller.Service.UserService;
import com.zdwsh.springclothing.controller.config.JedisUntil;
import com.zdwsh.springclothing.user.User;
import com.zdwsh.springclothing.user.UserInfo;
import com.zdwsh.springclothing.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Api(value = "登陆注册相关操作")
@RestController
public class UserController {


    @Autowired
    private UserService userService;



    @GetMapping("login")
    @ApiOperation(value = "用户登录",notes = "用户登录")
    public ResultVo login(@ApiParam(value = "用户账号（手机号）") @RequestParam(value = "phone") String phone, @ApiParam(value = "密码") @RequestParam(value = "password")String passsword ,HttpServletRequest request){
        HttpSession session = request.getSession();

        ResultVo resultVo = userService.login(phone,passsword);
        int id = (int) resultVo.getData();
        session.setAttribute("user",resultVo.getData());

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
    @PostMapping("info/findbyuid")
    @ApiOperation(value = "用户详情",notes = "通过uid查找用户")
    ResultVo findByUid( HttpServletRequest request) {
        HttpSession session = request.getSession();
        int id = (int) session.getAttribute("user");
        System.out.println(id);
        ResultVo resultVo = userService.findByUid(Integer.valueOf(id));
        return resultVo;
    }
    @PostMapping("info/upbyuid")
    @ApiOperation(value = "修改用户详情")
    ResultVo upInfo(@RequestBody UserInfo info) {
        return userService.upInfo(info);
    }
}
