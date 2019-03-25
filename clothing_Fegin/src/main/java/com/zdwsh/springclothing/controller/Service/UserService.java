package com.zdwsh.springclothing.controller.Service;

        import com.zdwsh.springclothing.user.User;
        import com.zdwsh.springclothing.vo.ResultVo;
        import org.apache.ibatis.annotations.Param;
        import org.springframework.cloud.openfeign.FeignClient;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "lxprovider")
public interface UserService {

    @RequestMapping("login")
    ResultVo login(@RequestParam("phone") String phone,@RequestParam("password") String password);
    @RequestMapping("register")
    ResultVo regist(@RequestBody User user);
}
