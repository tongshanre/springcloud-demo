package com.starts.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fei on 2017/8/10.
 */
@RestController
public class ControllerDemo {
    @RequestMapping("/hi")
    public String sayHi(@RequestParam String name) {
        return "hi " + name;
    }
}
