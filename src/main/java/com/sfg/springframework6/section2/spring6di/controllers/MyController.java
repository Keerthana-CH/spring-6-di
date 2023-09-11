package com.sfg.springframework6.section2.spring6di.controllers;

import com.sfg.springframework6.section2.spring6di.services.GreetingService;
import com.sfg.springframework6.section2.spring6di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    // GOAL: Using the classes without using dependency Injection
    // (because the GreetingServiceImpl has not annotated with @Service)
    // So we are creating an instance of GSImpl not as "this.greetingService = GreetingService greetingService"
    // in the constructor.
    // ************ For more understanding compare with the springboot-web-new repositories ************
    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I am in Controller");
        return greetingService.sayGreeting();
    }
}
