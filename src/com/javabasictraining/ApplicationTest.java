package com.javabasictraining;

public class ApplicationTest {

    public static void main(String[] args) {

        Toyota toyota = new Toyota();
        toyota.accelator();
        toyota.tailLight();
        toyota.brake();


        BMW bmw = new BMW();
        bmw.accelator();
        bmw.brake();
        bmw.tailLight();
    }

}
