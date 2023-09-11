package com.sfg.springframework6.section2.spring6di.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingService")
public class GreetingServiceImplSetter implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hi I am in setterGreetingService to test qualifier";
    }
}
