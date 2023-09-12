package com.sfg.springframework6.section2.spring6di.services.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class EnvironmentServiceQA implements EnvironmentService {
    @Override
    public String getEnvProfile() {
        return "qa";
    }
}
