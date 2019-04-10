package com.zdwsh.springclothing.userinfoservice;

import com.zdwsh.springclothing.user.UserInfo;
import com.zdwsh.springclothing.vo.ResultVo;

public interface UserinfoService {
    ResultVo findByUid(int uid);
    ResultVo upInfo(UserInfo info);
}
