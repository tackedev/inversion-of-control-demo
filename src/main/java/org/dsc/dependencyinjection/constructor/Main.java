package org.dsc.dependencyinjection.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Initialize Spring context
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("constructorInjectionConfig.xml");

        // Get Spring Bean
        Car car = context.getBean("car", Car.class);
        car.run();

        context.close();
    }
}
