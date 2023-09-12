package com.sfg.springframework6.section2.spring6di.services.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("prod")
@Service
public class EnvironmentServiceProd implements EnvironmentService {
    @Override
    public String getEnvProfile() {
        return "prod";
    }
}
