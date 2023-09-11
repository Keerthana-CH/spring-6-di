package com.sfg.springframework6.section2.spring6di.controllers.profilesC;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("profile1")
@SpringBootTest
class ProfilesControllerTest1 {

    @Autowired
    ProfilesController profilesController;

    @Test
    void sayHello() {
        System.out.println(profilesController.sayHello());
    }
}