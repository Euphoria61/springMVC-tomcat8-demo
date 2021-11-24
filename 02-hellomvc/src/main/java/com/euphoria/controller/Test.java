package com.euphoria.controller;

import com.euphoria.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: ❤ Euphoria ❤
 * @title: Test
 * @projectName SpringMVC
 * @description:
 * @date 2021/11/20  12:22
 */
@Controller
public class Test {
    @RequestMapping("/test")
    public String test(User user) {
        System.out.println(user);
        return "hello";
    }
}
