package com.sfg.springframework6.section2.spring6di.services.profiles;

import com.sfg.springframework6.section2.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("profile1")
@Service("profile")
public class profile1 implements GreetingService {
    @Override
    public String sayGreeting() {
        return "this is greeting profile 1";
    }
}
