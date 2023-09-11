package com.sfg.springframework6.section2.spring6di.controllers;

import com.sfg.springframework6.section2.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    GreetingService greetingService;
    public String sayHello(){
        return  greetingService.sayGreeting();
    }
}
