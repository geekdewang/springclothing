package com.zdwsh.springclothing.cartService;

import com.zdwsh.springclothing.menu.Cart;
import com.zdwsh.springclothing.vo.ResultVo;

public interface CartService {
    ResultVo insertCar(Cart cart);

    //展示购物车
    ResultVo selectAll();

    //通过id删除
    ResultVo deleteCart(Integer cid);

}
