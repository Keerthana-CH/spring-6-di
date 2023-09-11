package com.sfg.springframework6.section2.spring6di.controllers.profilesC;

import com.sfg.springframework6.section2.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ProfilesController {

    private final GreetingService greetingService;

    @Autowired
    public ProfilesController(@Qualifier("profile") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
