package com.ktz.solution.service;

import com.ktz.solution.domain.CommonResult;
import com.ktz.solution.domain.User;
import com.ktz.solution.service.fallback.UserServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "user-service", fallback = UserServiceFallback.class)
public interface UserService {

    @GetMapping("/user/{id}")
    CommonResult<User> getUser(@PathVariable Long id);

    @GetMapping("/user/getUserByIds")
    CommonResult<List<User>> getUserByIds(@RequestParam List<Long> ids);
}
