package com.zdwsh.springclothing.controller.Service;

import com.zdwsh.springclothing.vo.ResultVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(value = "lxmenuprovider")
public interface MenuService {
    @GetMapping("menushow")
    ResultVo menuShow();
}
