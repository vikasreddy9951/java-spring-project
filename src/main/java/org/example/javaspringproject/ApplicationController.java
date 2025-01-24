package org.example.javaspringproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping("/hello")
    public String helloworld(){
        return "Hello From Cloud Project";
    }
}
