package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class myController {
    
    @GetMapping("/")
    public String myFunction(){
        return "My Controller Running...";
    }

    @GetMapping("/check1")
    public String myFunction1(@RequestParam String msg){
        return "Messange in url is: "+msg;
    }

    @GetMapping("/check2")
    public String function2(){
        return "function 2 is calling without url parameters";
    }

    @GetMapping("/check3")
    public String function3(@RequestParam int count){
        return "function 3 is calling with url parameters: "+count;
    }

}
