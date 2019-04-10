package com.zdwsh.springclothing.provider.Controller;

import com.zdwsh.springclothing.user.UserInfo;
import com.zdwsh.springclothing.userinfoservice.UserinfoService;
import com.zdwsh.springclothing.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserinfoController {
    @Autowired
    private UserinfoService userinfoService;

    @PostMapping("info/findbyuid")
    ResultVo findByUid(@RequestParam("uid")int uid) {
        return userinfoService.findByUid(uid);
    }
    @PostMapping("info/upbyuid")
    ResultVo upInfo(@RequestBody UserInfo info) {
        return userinfoService.upInfo(info);
    }
}
