package com.sfg.springframework6.section2.spring6di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("I am in Controller");
        return "Hello Learners";
    }
}
