package com.oauth.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    @GetMapping("/hello")
    public String sendHello() {
        return "<h1 style=\"text-align: center; color: green; magrin-top: 20px;\">Hello</h1>";
    }

}
