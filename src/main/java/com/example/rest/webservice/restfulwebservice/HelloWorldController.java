package com.example.rest.webservice.restfulwebservice;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    // @RequestMapping(method = RequestMethod.GET,path = "/helloworld") Or
    @GetMapping(path = "/helloworld")
    public String helloWorld(){
        return "Hello Wolrd";
    }

    @GetMapping(path = "/helloworldbean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hii!!!! Gud Mrng");
    }
}
