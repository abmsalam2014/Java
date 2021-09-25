package com.javabasictraining;

public class BMW extends Vehicle{


    @Override
    public void tailLight() {
        System.out.println("Taillight: " + "red");
    }

    @Override
    public void accelator() {
        System.out.println("Accelerator: " + "ok");
    }
}
