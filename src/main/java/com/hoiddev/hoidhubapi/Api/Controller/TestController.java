package com.hoiddev.hoidhubapi.Api.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @GetMapping("/hello-world")
    public List<String> helloWorld() {
        return List.of("Hello", "World");
    }
}