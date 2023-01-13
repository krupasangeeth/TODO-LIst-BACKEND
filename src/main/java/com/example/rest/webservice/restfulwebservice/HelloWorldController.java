package com.example.rest.webservice.restfulwebservice;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class HelloWorldController {

    // @RequestMapping(method = RequestMethod.GET,path = "/helloworld") Or
    @GetMapping(path = "/helloworld")
    public String helloWorld(){
        return "Hello Wolrd";
    }

    @GetMapping(path = "/helloworldbean")
    public HelloWorldBean helloWorldBean(){
        throw new RuntimeException("Some Error Occured,Contact Support *******");
        // return new HelloWorldBean("Hii!!!! Gud Night");
    }

    //path Variable
    @GetMapping(path = "/hello/{name}")
    public HelloWorldBean paraName(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello , %s", name));
        
    }
}
