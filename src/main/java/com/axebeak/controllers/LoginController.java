package com.axebeak.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {


    @PostMapping("login")
    public String submitLogin(){

        return "login";
    }

    @GetMapping("login")
    public String loadLogin(){

        return "display-songs";
    }

}
