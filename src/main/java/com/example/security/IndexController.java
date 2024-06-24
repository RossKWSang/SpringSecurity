package com.example.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    // 시큐리티는 너무 어렵다 ㅠ
    @GetMapping("/")
    public String index() {
        return "index";
    }
}