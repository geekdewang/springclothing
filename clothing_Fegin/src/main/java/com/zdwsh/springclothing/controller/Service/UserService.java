package com.zdwsh.springclothing.controller.Service;

import com.zdwsh.springclothing.user.User;
import com.zdwsh.springclothing.vo.ResultVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "lxprovider")
public interface UserService {


    @GetMapping("login")
    ResultVo login(@RequestParam("phone") String phone,@RequestParam("password") String password);
    @PostMapping("register")
    ResultVo regist(@RequestBody User user);
    @PostMapping("findpassword")
    ResultVo findByPassword(@RequestParam("phone") String phone);
}
