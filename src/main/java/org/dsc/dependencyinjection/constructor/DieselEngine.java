package org.dsc.dependencyinjection.constructor;

import org.springframework.stereotype.Component;

@Component("dieselEngine")                                               //@Component for Bean Factory know this is a bean to scan
public class DieselEngine extends Engine {
    @Override
    public void run() {
        System.out.println("Running by diesel...");
    }
}
