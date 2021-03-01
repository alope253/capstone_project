package com.axebeak.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SongController {

    @PostMapping("display-song")
    public String sortBySongs(){

        return "display-song";
    }

    @GetMapping("display-song")
    public String showSongs(){
        return "display-song";
    }

}
