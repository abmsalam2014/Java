package oops.abstraction;

import oops.abstraction.BMW;
import oops.abstraction.Toyota;

public class AbstractionTest {

    public static void main(String[] args) {

        Toyota toyota = new Toyota();
        toyota.accelator();
        toyota.tailLight();
        toyota.brake();
        toyota.dashboard();


        BMW bmw = new BMW();
        bmw.accelator();
        bmw.brake();
        bmw.tailLight();
    }

}
