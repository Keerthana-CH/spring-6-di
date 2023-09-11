package com.sfg.springframework6.section2.spring6di.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServiceImplProperty implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hi I am in propertyGreetingService to test qualifier";
    }
}
