package com.restfulwebservice.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
@GetMapping(path = "/hello_world")
    public String hellWorld() {
        return "Hello World";
    }
    @GetMapping(path = "/hello_worldbean")
    public HelloWorldBean hellWorldBean() {//how to get response in format of json
        return new HelloWorldBean("Hello World");
    }
}
