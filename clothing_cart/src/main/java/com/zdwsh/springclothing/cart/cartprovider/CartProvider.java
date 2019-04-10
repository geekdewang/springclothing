package com.zdwsh.springclothing.cart.cartprovider;

import com.zdwsh.springclothing.cartService.CartService;
import com.zdwsh.springclothing.menu.Cart;
import com.zdwsh.springclothing.menuDao.CartMapper;
import com.zdwsh.springclothing.util.ResultUtil;
import com.zdwsh.springclothing.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartProvider implements CartService {
    @Autowired
    private CartMapper cartMapper;


    @Override
    public ResultVo insertCar(Cart cart) {
        return null;
    }

    //查询购物车所有商品
    @Override
    public ResultVo selectAll() {
        try {
            List<Cart> list = cartMapper.findAll();
            return ResultUtil.exec(true,"OK",list);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.exec(false,"OK",e.getMessage());
        }
    }

    //通过id删除购物车商品
    @Override
    public ResultVo deleteCart(Integer cid) {
        try {
            cartMapper.deleteByPrimaryKey(cid);
            return ResultUtil.exec(true,"OK",null);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.exec(false,"ERROR",e.getMessage());
        }
    }
}
