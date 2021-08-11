package org.dsc.dependencyinjection.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("car")                           //@Component for Bean Factory know this is a bean to scan
public class Car {
    @Autowired                              // @Autowired for mark for the Spring Context know to use this Setter to inject dependencies
    @Qualifier("dieselEngine")              //@Qualifier for select which implemented of Engine Interface to inject
    private Engine engine;

    public Car() {
    }

    public void run() {
        engine.run();
    }
}
