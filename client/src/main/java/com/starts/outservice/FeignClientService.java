package com.starts.outservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by fei on 2017/8/12.
 */
@FeignClient(value="s-service")
public interface FeignClientService {

    @RequestMapping(value="hi")
    String hi(@RequestParam(value = "name") String name);
}
