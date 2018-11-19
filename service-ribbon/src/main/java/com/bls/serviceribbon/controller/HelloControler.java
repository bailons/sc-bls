package com.bls.serviceribbon.controller;

import com.bls.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloControler
 * @Description TODO
 * @Author leibailong
 * @Date 2018/11/19 15:01
 * @Version 1.0
 **/
@RestController
public class HelloControler {
    @Autowired
    HelloService helloService;
    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
