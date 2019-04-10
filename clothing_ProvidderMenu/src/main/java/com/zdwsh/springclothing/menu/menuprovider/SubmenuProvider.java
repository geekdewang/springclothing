package com.zdwsh.springclothing.menu.menuprovider;

import com.zdwsh.springclothing.menu.Submenu;
import com.zdwsh.springclothing.menuDao.SubmenuMapper;
import com.zdwsh.springclothing.submenuservice.SubmenuService;
import com.zdwsh.springclothing.util.ResultUtil;
import com.zdwsh.springclothing.vo.ResultVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class SubmenuProvider implements SubmenuService {

    @Autowired
    private SubmenuMapper submenuMapper;

    //根据mid来展示所有菜单
    @Override
    public ResultVo submenuShow(int mid) {
        try {
            List<Submenu> submenuList = submenuMapper.findByMid(mid);
            return ResultUtil.exec(true,"OK",submenuList);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.exec(false,"ERROR",e.getMessage());
        }
    }
}
