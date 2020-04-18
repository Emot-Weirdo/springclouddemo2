package com.southwind.feign.impl;

import com.southwind.entity.Student;
import com.southwind.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

/**
 * 服务熔断
 * 容错处理
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Student findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中。。。。";
    }
}
