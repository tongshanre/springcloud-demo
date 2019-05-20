package cn.dfcx.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MyController {

    @Value("${tom.name}")
    private String name;

    @GetMapping("/")
    public String sayHi(){
        return "hi" +name;
    }
}
