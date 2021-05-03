package com.yeah.domain;

import lombok.Data;

/**
 * @author: yeah
 * lombok 的作用：自动生成set和get方法
 */
@Data
public class Student {
    private String name;
    private int age;
}
