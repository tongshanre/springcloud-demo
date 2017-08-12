package com.starts.controller;

import com.starts.outservice.FeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by fei on 2017/8/12.
 */
@RestController
public class HiController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("ribbon/hi")
    public String sayHi(@RequestParam String name){
        return "ribbon "+restTemplate.getForObject("http://S-SERVICE/hi?name="+name,String.class);
    }

    @Autowired
    FeignClientService feignClientTest;

    @RequestMapping("feign/hi")
    public String sayHi2(@RequestParam String name){
        return "feigh "+feignClientTest.hi(name);
    }

}
