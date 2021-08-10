package org.dsc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Autowired
    @Qualifier("dieselEngine")
    private Engine engine;

    public Car() {
    }

    public void run() {
        engine.run();
    }
}