package com.bls.sericefeign.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName SchedualServiceHiHystric
 * @Description TODO
 * @Author leibailong
 * @Date 2018/11/19 16:03
 * @Version 1.0
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
