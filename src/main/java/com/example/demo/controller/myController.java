package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {
    
    @GetMapping("/check")
    public String myFunction(@RequestParam String msg){
        return "Messange in url is: "+msg;
    }

    @GetMapping("/check2")
    public String function2(){
        return "function 2 is calling without url parameters";
    }

}
