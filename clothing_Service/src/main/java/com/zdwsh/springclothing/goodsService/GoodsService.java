package com.zdwsh.springclothing.goodsService;

import com.zdwsh.springclothing.vo.ResultVo;

public interface GoodsService {
    ResultVo findBySid(int sid);
    ResultVo findByGid(int gid);
}
