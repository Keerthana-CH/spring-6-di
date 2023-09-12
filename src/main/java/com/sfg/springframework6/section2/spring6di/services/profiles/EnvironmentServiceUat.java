package com.sfg.springframework6.section2.spring6di.services.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class EnvironmentServiceUat implements EnvironmentService {
    @Override
    public String getEnvProfile() {
        return "uat";
    }
}
