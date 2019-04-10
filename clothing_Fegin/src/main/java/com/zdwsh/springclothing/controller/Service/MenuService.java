package com.zdwsh.springclothing.controller.Service;

import com.zdwsh.springclothing.vo.ResultVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "lxmenuprovider")
public interface MenuService {
    @GetMapping("menushow")
    ResultVo menuShow();
    @PostMapping("submenulist")
    ResultVo submenuList(@RequestParam("mid")int mid);
    @PostMapping("findbysid")
    ResultVo findBySid(@RequestParam("sid")int sid);
    @PostMapping("findbygid")
    ResultVo findByGid(@RequestParam("gid")int gid);
}
