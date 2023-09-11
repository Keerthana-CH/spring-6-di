package com.sfg.springframework6.section2.spring6di.controllers;

import com.sfg.springframework6.section2.spring6di.services.GreetingService;
import org.springframework.stereotype.Controller;

public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String  sayHello(){
        return greetingService.sayGreeting();
    }
}
