package com.euphoria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: ❤ Euphoria ❤
 * @title: Encode
 * @projectName SpringMVC
 * @description:
 * @date 2021/11/20  12:29
 */
@Controller
public class Encode {
    @RequestMapping("/e/t")
    public String test(Model model, String name) {
        model.addAttribute("msg", name); //获取表单提交的值
        return "hello"; //跳转到test页面显示输入的值
    }
}

