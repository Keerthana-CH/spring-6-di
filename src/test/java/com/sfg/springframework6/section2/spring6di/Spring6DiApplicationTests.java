package com.sfg.springframework6.section2.spring6di;

import com.sfg.springframework6.section2.spring6di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {


    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    MyController myController;

    @Test
    void testMyCntrlrThroughApplCntxBean(){
        MyController myController = applicationContext.getBean(MyController.class);

        System.out.println(myController.sayHello());
    }

    @Test
    void testMyCntrlrBeanThroughAutowiring(){
        System.out.println(myController.sayHello());
    }

    @Test
    void contextLoads() {
    }

}
