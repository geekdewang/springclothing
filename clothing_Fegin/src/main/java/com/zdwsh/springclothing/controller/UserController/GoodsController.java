package com.zdwsh.springclothing.controller.UserController;

import com.zdwsh.springclothing.controller.Service.GoodsService;
import com.zdwsh.springclothing.controller.Service.MenuService;
import com.zdwsh.springclothing.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "展示商品信息")
@RestController
public class GoodsController {
    /**
     * 没的问题
     */
    @Autowired
    private MenuService goodsService;

    @PostMapping("findbysid")
    @ApiOperation(value = "根据sid展示其中一类的商品")
    ResultVo findBySid(@RequestParam("sid")int sid) {
        return goodsService.findBySid(sid);
    }

    @PostMapping("findbygid")
    @ApiOperation(value = "根据gid展示商品详情")
    ResultVo findByGid(@RequestParam("gid")int gid) {
        return goodsService.findByGid(gid);
    }
}
