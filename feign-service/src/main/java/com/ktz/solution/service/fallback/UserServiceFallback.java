package com.ktz.solution.service.fallback;

import com.ktz.solution.domain.CommonResult;
import com.ktz.solution.domain.User;
import com.ktz.solution.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName UserServiceFallback
 * @Description
 * @Author kaituozhesh
 * @Date 2020/4/3 8:41
 * @Version V1.0.0
 **/
@Component
public class UserServiceFallback implements UserService {
    @Override
    public CommonResult<User> getUser(Long id) {
        User defaultUser = new User(-1L, "defaultUser", "123456");
        return new CommonResult<>(defaultUser);
    }

    @Override
    public CommonResult<List<User>> getUserByIds(List<Long> ids) {
        return null;
    }
}
