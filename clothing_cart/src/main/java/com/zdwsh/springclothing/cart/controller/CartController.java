package com.zdwsh.springclothing.cart.controller;

import com.zdwsh.springclothing.cart.cartprovider.CartProvider;
import com.zdwsh.springclothing.util.ResultUtil;
import com.zdwsh.springclothing.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
    @Autowired
    private CartProvider cartProvider;

    @GetMapping("selectAllCar")
   ResultVo showAllCart(){
        return cartProvider.selectAll();
    }

    @GetMapping("deleteCart")
    ResultVo deleteById(Integer cid) {
        return cartProvider.deleteCart(cid);
    }
}
