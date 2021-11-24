package com.euphoria.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: ❤ Euphoria ❤
 * @title: User
 * @projectName SpringMVC
 * @description:
 * @date 2021/11/20  11:56
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private int age;
}
