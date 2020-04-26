package com.example.mockmvctest.contoller;

import com.example.mockmvctest.domain.Person;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello(String name){
        return "Hello " + name + "!";
    }

    @RequestMapping("/getPerson/{id}")
    public Person getPerson(@PathVariable int id){
        return new Person(id,"ruanxk");
    }
}
