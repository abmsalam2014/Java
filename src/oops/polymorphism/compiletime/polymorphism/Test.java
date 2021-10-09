package oops.polymorphism.compiletime.polymorphism;

public class Test {

    public static void main(String[] args) {
        Car car = new Car();
        car.drive("Tapan");
        car.drive("Tapan", "X8");
        car.drive("tapan","AMG",2022);

    }
}
