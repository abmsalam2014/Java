package com.javabasictraining;

public class Toyota extends Vehicle {

    @Override
    public void tailLight() {
        System.out.println("Taillight color is: " + "Blue");
    }

    @Override
    public void accelator() {
        System.out.println("Toyota accelator is ok");

    }
    public void dashboard(){
        System.out.println("Toyota had a music dashboard");
    }
}
