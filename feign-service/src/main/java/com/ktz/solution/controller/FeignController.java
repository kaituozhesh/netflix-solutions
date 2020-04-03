package com.ktz.solution.controller;

import com.ktz.solution.domain.CommonResult;
import com.ktz.solution.domain.User;
import com.ktz.solution.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName FeignController
 * @Description
 * @Author kaituozhesh
 * @Date 2020/4/3 8:40
 * @Version V1.0.0
 **/
@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public CommonResult<User> getUser(@PathVariable Long id){
        System.out.println("xxx");
        return userService.getUser(id);
    }

}
