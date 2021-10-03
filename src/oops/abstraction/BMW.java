package oops.abstraction;

import oops.abstraction.Vehicle;

public class BMW extends Vehicle {


    @Override
    public void tailLight() {
        System.out.println("Taillight: " + "red");
    }

    @Override
    public void accelator() {
        System.out.println("Accelerator: " + "ok");
    }
}
