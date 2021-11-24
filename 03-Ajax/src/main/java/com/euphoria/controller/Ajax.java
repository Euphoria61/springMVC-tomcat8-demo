package com.euphoria.controller;

import com.euphoria.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: ❤ Euphoria ❤
 * @title: Ajax
 * @projectName SpringMVC
 * @description:
 * @date 2021/11/22  16:08
 */
@RestController
public class Ajax {
    @RequestMapping("/t1")
    public String Text1() {
        return "hello";
    }

    @RequestMapping("/a1")
    public void al(String name, HttpServletResponse response) throws IOException {
        System.out.println(name);
        if ("liujie".equals(name)) {
            response.getWriter().print("true");
        } else {
            response.getWriter().print("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2() {
        List<User> users = new ArrayList<User>();
        users.add(new User(1, "zzf"));
        users.add(new User(2, "my"));
        return users;
    }

    @RequestMapping("/a3")
    public String ajax3(String name, String pwd) {
        String msg = "";
        //模拟数据库中存在数据
        if (name != null) {
            if ("admin".equals(name)) {
                msg = "OK";
            } else {
                msg = "用户名输入错误";
            }
        }
        if (pwd != null) {
            if ("123456".equals(pwd)) {
                msg = "OK";
            } else {
                msg = "密码输入有误";
            }
        }
        return msg; //由于@RestController注解，将msg转成json格式返回
    }
}
