package org.dsc.afterdip;

public class Car {
    private final Engine engine;

    public Car() {
        engine = new PetrolEngine();
    }

    public void run() {
        engine.run();
    }
}
