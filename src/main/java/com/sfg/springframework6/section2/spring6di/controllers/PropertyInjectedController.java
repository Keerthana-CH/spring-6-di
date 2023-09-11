package com.sfg.springframework6.section2.spring6di.controllers;

import com.sfg.springframework6.section2.spring6di.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;
    public String sayHello(){
        return  greetingService.sayGreeting();
    }
}
