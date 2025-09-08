package com.aspire.casestudy1.aspire_casestudy1_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/hello1")
    public String sayHello1() {
        return "Hello1, World!";
    }
     @GetMapping("/hello2")
    public String sayHello() {
        return "Hello2, World!";
    }
}
