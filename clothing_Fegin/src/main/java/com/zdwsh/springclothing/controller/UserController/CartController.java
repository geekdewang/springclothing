package com.zdwsh.springclothing.controller.UserController;
import com.zdwsh.springclothing.controller.Service.CartService;
import com.zdwsh.springclothing.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "购物车这一块")
@RestController
public class CartController {
    @Autowired
    private CartService cartService;

    @ApiOperation(value = "展示购物车商品",notes = "购物车展示")
    @GetMapping("selectAllCar")
    ResultVo showAll(){
        return  cartService.selectAll();
    }

    @ApiOperation(value = "通过id删除购物车商品",notes = "通过id删除购物车商品")
    @GetMapping("deleteCart")
    ResultVo deleteCart(@ApiParam(value = "用户id") @RequestParam("cid") Integer cid) {
        return cartService.deleteCartGoods(cid);
    }

}
