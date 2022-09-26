package com.restfulwebservice.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.*;

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
    @GetMapping(path = "/hello_worldpathformatter/{name}")
    public HelloWorldBean hellWorldBeanPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World %s",name));
    }
}
