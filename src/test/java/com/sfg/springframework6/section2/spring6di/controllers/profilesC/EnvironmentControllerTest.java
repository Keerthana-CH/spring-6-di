package com.sfg.springframework6.section2.spring6di.controllers.profilesC;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
@ActiveProfiles({"uat","profile1"})
@SpringBootTest
class EnvironmentControllerTest {

    @Autowired
    EnvironmentController environmentController;
    @Test
    void getEnv() {
        System.out.println(environmentController.getEnv());

    }
}