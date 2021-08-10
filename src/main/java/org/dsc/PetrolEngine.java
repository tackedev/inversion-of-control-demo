package org.dsc;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements Engine {
    @Override
    public void run() {
        System.out.println("Running by petrol...");
    }
}
