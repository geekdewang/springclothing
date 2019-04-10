package com.zdwsh.springclothing.provider.userprovider;

import com.zdwsh.springclothing.user.UserInfo;
import com.zdwsh.springclothing.userDao.UserInfoMapper;
import com.zdwsh.springclothing.userinfoservice.UserinfoService;
import com.zdwsh.springclothing.util.ResultUtil;
import com.zdwsh.springclothing.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserinfoProvider implements UserinfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public ResultVo findByUid(int uid) {
        try {
            UserInfo info = userInfoMapper.findByUid(uid);
            return ResultUtil.exec(true,"OK",info);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.exec(false,"ERROR",e.getMessage());
        }
    }

    @Override
    public ResultVo upInfo(UserInfo info) {
        try {
            userInfoMapper.updateByPrimaryKeySelective(info);
            return ResultUtil.exec(true,"OK",null);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.exec(false,"ERROR",e.getMessage());
        }
    }
}
