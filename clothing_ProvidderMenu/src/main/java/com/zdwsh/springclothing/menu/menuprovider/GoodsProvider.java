package com.zdwsh.springclothing.menu.menuprovider;

import com.zdwsh.springclothing.goodsService.GoodsService;
import com.zdwsh.springclothing.menu.Goods;
import com.zdwsh.springclothing.menu.Submenu;
import com.zdwsh.springclothing.menuDao.GoodsMapper;
import com.zdwsh.springclothing.util.ResultUtil;
import com.zdwsh.springclothing.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsProvider implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    //通过Sid查找某一类型的全部商品
    @Override
    public ResultVo findBySid(int sid) {
        try {
            List<Goods> list = goodsMapper.findBySid(sid);
            return ResultUtil.exec(true,"OK",list);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.exec(false,"ERROR",e.getMessage());
        }
    }

    //通过gid查找商品详情
    @Override
    public ResultVo findByGid(int gid) {
        try {
            Goods goods = goodsMapper.findByGid(gid);
            return ResultUtil.exec(true,"OK",goods);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.exec(false,"ERROR",e.getMessage());
        }
    }
}
