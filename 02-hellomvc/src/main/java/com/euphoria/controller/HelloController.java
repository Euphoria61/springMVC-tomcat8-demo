package com.euphoria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: ❤ Euphoria ❤
 * @title: HelloController
 * @projectName SpringMVC
 * @description:
 * @date 2021/11/18  19:26
 */
@Controller
public class HelloController {
    @RequestMapping("hello")
    public String sayHello(Model model) {
        //封装对象，放在ModelAndView中。Model
        model.addAttribute("msg", "HelloSpringMVC!");
        //封装要跳转的视图，放在ModelAndView中
        return "hello";
    }

}