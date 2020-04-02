package com.ktz.solution.controller;

import com.ktz.solution.domain.CommonResult;
import com.ktz.solution.domain.User;
import com.ktz.solution.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public CommonResult create(@RequestBody User user) {
        return new CommonResult("操作成功", 200);
    }

    @PostMapping("/{id}")
    public CommonResult<User> getUser(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        user.setPassword("123123");
        user.setUsername("aaaa");
        logger.info("根据id获取用户信息，用户名称为：{}", user.getUsername());
        return new CommonResult<>(user);
    }

    @GetMapping("/getUserByIds")
    public CommonResult<List<User>> getUserByIds(@RequestParam List<Long> ids) {
        List<User> userList = userService.getUserByIds(ids);
        logger.info("根据ids获取用户信息，用户列表为：{}", userList);
        return new CommonResult<>(userList);
    }
}
