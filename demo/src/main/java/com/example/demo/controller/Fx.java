package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class Fx {

    @GetMapping("/")
    public String ee() {
        return "/뒤에 id를 입력하세요";
    }
    
    @RequestMapping("/{id}")
    public @ResponseBody String qq(@PathVariable int id){
        return ("안녕하세요 " + id + "님");
    }

    @GetMapping("/multiply")
    public static @ResponseBody double ww(@RequestParam double x, @RequestParam double y) {
    double result = x*y;
    return result;

    } 

    }


