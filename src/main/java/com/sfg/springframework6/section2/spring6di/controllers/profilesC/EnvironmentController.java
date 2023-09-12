package com.sfg.springframework6.section2.spring6di.controllers.profilesC;

import com.sfg.springframework6.section2.spring6di.services.profiles.EnvironmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    @Autowired
    private final EnvironmentService environmentService;

    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnv(){
        return "You are in " + environmentService.getEnvProfile() + " Environment";
    }
}
