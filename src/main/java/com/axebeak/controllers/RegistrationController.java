package com.axebeak.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @GetMapping("new-user")
    public String loadNewUser(){
        return "login";
    }

    @PostMapping("new-user")
    public String makeNewUser(){
        return "new-user";
    }

}
