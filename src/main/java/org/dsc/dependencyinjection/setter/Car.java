package org.dsc.dependencyinjection.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private final Engine engine;

    @Autowired                                                 // @Autowired for mark for the Spring Context know to use this Constructor to inject dependencies
    public Car(@Qualifier("dieselEngine") Engine engine) {     //@Qualifier for select which implemented of Engine Interface to inject
        this.engine = engine;
    }

    public void run() {
        engine.run();
    }
}
