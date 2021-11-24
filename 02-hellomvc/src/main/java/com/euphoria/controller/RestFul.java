package com.euphoria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: ❤ Euphoria ❤
 * @title: Test
 * @projectName SpringMVC
 * @description:
 * @date 2021/11/20  11:58
 */
@Controller
public class RestFul {
    @RequestMapping("/Test/{a}/{b}")
    public String restFul(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", res);
        return "hello";


    }
}
