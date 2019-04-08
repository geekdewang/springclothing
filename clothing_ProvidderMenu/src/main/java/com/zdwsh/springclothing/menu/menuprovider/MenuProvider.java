package com.zdwsh.springclothing.menu.menuprovider;

import com.zdwsh.springclothing.menuDao.MenuMapper;
import com.zdwsh.springclothing.menuService.MenuService;
import com.zdwsh.springclothing.util.ResultUtil;
import com.zdwsh.springclothing.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuProvider implements MenuService {
    @Autowired
    private MenuMapper menuMapper;

    //展示所有菜单
    @Override
    public ResultVo menuShow() {
        try {
            return ResultUtil.exec(true,"OK",menuMapper.selectAll());
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.exec(false,"ERROR",e.getMessage());
        }
    }
}
