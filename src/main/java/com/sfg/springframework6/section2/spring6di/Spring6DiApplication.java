package com.sfg.springframework6.section2.spring6di;

import com.sfg.springframework6.section2.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Spring6DiApplication.class, args);

        MyController controller = context.getBean(MyController.class);

        System.out.println("main application");
        System.out.println(controller.sayHello());
    }

}
