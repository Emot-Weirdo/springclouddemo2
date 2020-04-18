package com.southwind;

import com.southwind.entity.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Student findAll(){
        Student student = new Student("1","LH");
        return student;
    }

    @GetMapping("/index")
    public String index(){
        return "port: "+port;
    }

}
