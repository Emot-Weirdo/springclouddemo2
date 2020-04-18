package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplateApplication {

    public static void main(String[] args) {

        System.out.println("已启动");
        SpringApplication.run(RestTemplateApplication.class,args);
    }

    @Bean
    public RestTemplate restTemplate(){

        System.out.println("已加载");
        return new RestTemplate();
    }
}
