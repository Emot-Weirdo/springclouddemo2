package com.southwind.controller;

import com.southwind.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/rest")
public class RestTemplateController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/find")
    public Student find(){
        System.out.println("dd");
        return restTemplate.getForEntity("http://localhost:8010/student/findAll",Student.class).getBody();
    }
}
