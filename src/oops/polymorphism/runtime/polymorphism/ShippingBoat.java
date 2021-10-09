package oops.polymorphism.runtime.polymorphism;

public class ShippingBoat extends Vehicle{

    @Override
    public void engine(String name) {
        System.out.println("Shipping boat habe 4 engine" + ":" + name);
    }
}
