package com.sfg.springframework6.section2.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingServiceImplPrimary implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello you are in GreetingService Primary Bean!!!";
    }
}
