package com.zdwsh.springclothing.provider.userprovider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdwsh.springclothing.user.User;
import com.zdwsh.springclothing.userDao.UserMapper;
import com.zdwsh.springclothing.userService.UserService;
import com.zdwsh.springclothing.util.ResultUtil;
import com.zdwsh.springclothing.vo.ResultVo;

@Service
public class UserProvicder implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public ResultVo lgoin(String phone, String password) {
        ResultVo resultVo = new ResultVo();
        try {
            if (phone  == null || password == null) {
                throw new RuntimeException("用户名或者密码不能 为空");
            }
            User user1 = userMapper.findByName(phone);
            if (!user1.getPassword().equals(password)) {
                throw new RuntimeException("输入密码错误");
            }
           resultVo= ResultUtil.exec(true,"登录成功",user1);
        } catch (Exception e) {
            e.printStackTrace();
            resultVo = ResultUtil.exec(false,"登录失败",e.getMessage());
        }
        return resultVo;
    }

    @Override
    public ResultVo regist(User user) {
        ResultVo resultVo = new ResultVo();
        try {
            userMapper.insert(user);
            resultVo= ResultUtil.exec(true,"注册成功",null);
        } catch (Exception e) {
            e.printStackTrace();
            resultVo = ResultUtil.exec(false,"注册失败",e.getMessage());
        }
        return resultVo;
    }
}
