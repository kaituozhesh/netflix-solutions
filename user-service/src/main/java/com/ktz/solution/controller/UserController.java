package com.ktz.solution.controller;

import com.ktz.solution.domain.CommonResult;
import com.ktz.solution.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName UserController
 * @Description
 * @Author kaituozhesh
 * @Date 2020/4/2 8:37
 * @Version V1.0.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping("/create")
    public CommonResult create(@RequestBody User user) {
        return new CommonResult("操作成功", 200);
    }

    @GetMapping("/{id}")
    public CommonResult<User> getUser(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        user.setPassword("123123");
        user.setUsername("aaaa");
        logger.info("根据id获取用户信息，用户名称为：{}", user.getUsername());
        return new CommonResult<>(user);
    }


}
