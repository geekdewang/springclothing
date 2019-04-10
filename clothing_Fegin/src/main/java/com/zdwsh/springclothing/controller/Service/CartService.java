package com.zdwsh.springclothing.controller.Service;

import com.zdwsh.springclothing.vo.ResultVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "cartprovider")
public interface CartService {
    @GetMapping("selectAllCar")
    ResultVo selectAll();

    @GetMapping("deleteCart")
    ResultVo deleteCartGoods(@RequestParam("cid") Integer cid);

}

