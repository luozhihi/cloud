package com.example.demo;

import com.alibaba.fastjson.JSON;

public class Demo {
    public static void main(String[] args) {
        String str = "{\"vCode\":\"code\"}";
        User user = JSON.parseObject(str, User.class);
//        user.setvCode("aaa");
        System.out.println(user);
    }
}
class User{
    private String vCode;

    public String getvCode() {
        return vCode;
    }

    public void setvCode(String vCode) {
        this.vCode = vCode;
    }
}

