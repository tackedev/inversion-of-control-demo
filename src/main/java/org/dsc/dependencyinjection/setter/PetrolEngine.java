package org.dsc.dependencyinjection.setter;

import org.springframework.stereotype.Component;

@Component("petrolEngine")                                                     //@Component for Bean Factory know this is a bean to scan
public class PetrolEngine extends Engine {
    @Override
    public void run() {
        System.out.println("Running by petrol...");
    }
}
