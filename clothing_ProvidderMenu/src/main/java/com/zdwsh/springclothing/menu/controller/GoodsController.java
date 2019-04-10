package com.zdwsh.springclothing.menu.controller;

import com.zdwsh.springclothing.goodsService.GoodsService;
import com.zdwsh.springclothing.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @PostMapping("findbysid")
    ResultVo findBySid(@RequestParam("sid")int sid) {
        return goodsService.findBySid(sid);
    }
    @PostMapping("findbygid")
    ResultVo findByGid(@RequestParam("gid")int gid) {
        return goodsService.findByGid(gid);
    }
}
