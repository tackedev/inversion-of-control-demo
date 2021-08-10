package org.dsc.dependencyinjection.setter;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements Engine {
    @Override
    public void run() {
        System.out.println("Running by diesel...");
    }
}
