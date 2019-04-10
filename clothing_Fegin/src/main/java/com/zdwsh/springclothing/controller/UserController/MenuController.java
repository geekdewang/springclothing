package com.zdwsh.springclothing.controller.UserController;

import com.zdwsh.springclothing.controller.Service.MenuService;
import com.zdwsh.springclothing.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "展示主页数据")
@RestController
public class MenuController {
    @Autowired
    private MenuService menuService;


    @ApiOperation(value = "展示主菜单信息",notes = "主菜单展示")
    @GetMapping("menushow")
    ResultVo showAll(){
        return menuService.menuShow();
    }

    @ApiOperation(value = "展示子菜单信息",notes = "子菜单展示")
    @GetMapping("submenulist")
    ResultVo submenuList(@RequestParam("mid") int mid){
        return menuService.submenuList(mid);
    }

}
