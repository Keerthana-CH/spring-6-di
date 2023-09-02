package com.sfg.springframework6.section2.spring6di.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello this is Greeting Service Impl";
    }
}
