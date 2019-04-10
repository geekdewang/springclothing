package com.zdwsh.springclothing.menu.controller;

import com.zdwsh.springclothing.submenuservice.SubmenuService;
import com.zdwsh.springclothing.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubmenuController {

    @Autowired
    private SubmenuService submenuService;

    @PostMapping("submenulist")
    ResultVo submenuList(@RequestParam("mid")int mid){
        return submenuService.submenuShow(mid);
    }


}
