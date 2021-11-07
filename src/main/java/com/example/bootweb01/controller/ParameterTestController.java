package com.example.bootweb01.controller;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ParameterTestController {


    @GetMapping("/car/{id}/owner/{username}")
    public Map<String,Object> Car(@PathVariable("id") Integer id,
                                  @PathVariable("username") String name,
                                  @PathVariable Map<String,String> pv) {
        Map<String, Object> map = new HashMap<>();
        map.put("id",id);
        map.put("username",name);
        map.put("pv",pv);
        return map;
    }

    @GetMapping("/book")
    public Map<String,Object> Book(@RequestHeader("User-Agent") String userAgent,
                                   @RequestHeader Map<String,String> header,
                                   @CookieValue("JSESSIONID") String JSESSIONID,
                                   @CookieValue("_xsrf") Cookie cookie){
        Map<String,Object> map = new HashMap<>();
//        map.put("User-Agent",userAgent);
//        map.put("Headers",header);
        map.put("JsessionID",JSESSIONID);
        System.out.println(cookie);
        return map;
    }
    @PostMapping("/computer")
    public Map<String,Object> computer(@RequestParam("age") Integer age,
                                       @RequestParam("name") String name,
                                       @RequestParam Map<String,String> params,
                                       @RequestBody String content){
        Map<String,Object> map = new HashMap<>();
        map.put("age",age);
        map.put("name",name);
        map.put("params",params);
        map.put("content",content);
        return map;
    }



}
