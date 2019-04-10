package com.zdwsh.springclothing.menu.controller;

import com.zdwsh.springclothing.cmenuService.CmenuService;
import com.zdwsh.springclothing.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {
    @Autowired
    private CmenuService menuService;

    @GetMapping("menushow")
    ResultVo showAll(){
        return menuService.menuShow();
    }


}
