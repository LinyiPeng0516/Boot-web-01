package com.example.bootweb01.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String getUser(){
        return "hello-ZhangSan";
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String getUser1(){
        return "POST-ZhangSan";
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getUser2(){
        return "GET-ZhangSan";
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String getUser3(){
        return "PUT-ZhangSan";
    }

    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public String getUser4(){
        return "DELETE-ZhangSan";
    }


}
