package com.axebeak.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @PostMapping("user")
    public String addToCart(){

        return "user";
    }

    @GetMapping("user")
    public String showCart(){
        return "user";
    }






}
