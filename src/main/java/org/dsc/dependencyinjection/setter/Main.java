package org.dsc.dependencyinjection.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Initialize Spring context
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("setterInjectionConfig.xml");

        // Get Spring Bean
        Car car = context.getBean("car", Car.class);
        car.run();

        context.close();
    }
}
