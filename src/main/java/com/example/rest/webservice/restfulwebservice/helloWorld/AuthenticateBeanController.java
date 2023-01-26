package com.example.rest.webservice.restfulwebservice.helloWorld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class AuthenticateBeanController {

    // @RequestMapping(method = RequestMethod.GET,path = "/helloworld") Or


    @GetMapping(path = "/basicauth")
    public AuthenticationBean basicAuthentication(){
        return new AuthenticationBean("Hello Wolrd");
    }
}   
