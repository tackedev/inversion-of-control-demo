package org.dsc.dependencyinjection.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private Engine engine;

    public Car() {
    }

    @Autowired                     // @Autowired for mark for the Spring Context know to use this Setter to inject dependencies
    @Qualifier("petrolEngine")     //@Qualifier for select which implemented of Engine Interface to inject
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void run() {
        engine.run();
    }
}
