package com.example.bootweb01.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AttributeMatrixController {

    @GetMapping("/cars")
    @ResponseBody
    public Map<String,Object> carsSell(@MatrixVariable(pathVar = "low",required = false) Integer low,
                                       @MatrixVariable(pathVar = "brand",required = false) List<String> brand){
        Map<String,Object> map = new HashMap<>();
        map.put("low",low);
        map.put("brand",brand);
        System.out.println("low = "+low);
        System.out.println("brand = "+ brand);
        return map;
    }

    @GetMapping("/todo")
    public String todo(HttpServletRequest request){
        request.setAttribute("age",18);
        request.setAttribute("code",200);
        return "forward:/mouse"; //转发请求
    }

    @ResponseBody
    @RequestMapping("/mouse")
    public Map<String,Object> mouse(@RequestAttribute("age") Integer age,
                        @RequestAttribute("code") Integer code){
        Map<String,Object> map= new HashMap<>();
        map.put("age",age);
        map.put("code",code);
        return map;
    }
}
