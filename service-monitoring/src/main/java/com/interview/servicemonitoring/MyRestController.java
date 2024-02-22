package com.interview.servicemonitoring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @GetMapping(path = "/")
    public String defaultPath() {
        return this.greeting();
    }
    @GetMapping(path = "/hello")
    public String greeting() {
        return "Hello";
    }
}
