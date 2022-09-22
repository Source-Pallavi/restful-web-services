package com.restfulwebservice.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
@RequestMapping(method = RequestMethod.GET,path = "/hello_world")
    public String hellWorld() {
        return "Hello World";
    }
}
