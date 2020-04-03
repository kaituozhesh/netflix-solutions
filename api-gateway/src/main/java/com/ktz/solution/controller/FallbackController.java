package com.ktz.solution.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @ClassName FallbackController
 * @Description
 * @Author kaituozhesh
 * @Date 2020/4/3 15:52
 * @Version V1.0.0
 **/
@RestController
public class FallbackController {

    @GetMapping("/fallback")
    public Object fallback() {
        HashMap<String, Object> result = new HashMap<String, Object>() {
            {
                put("data", null);
                put("message", "Get request fallback!");
                put("code", 500);
            }
        };
        return result;
    }

}
