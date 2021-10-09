package oops.polymorphism.compiletime.polymorphism;

public class Car {

    //method-overload process-Java polymorphism-CompileTime/StaticPolymorphism
    public void drive(String name){
        System.out.println("Person Driving BMW Car" + " " + name);
    }

    public void drive(String name, String model){
        System.out.println("Persons Driving MercedesBenz Car" + " " + name + "," + model);

    }

    public void drive(String name, String model, int year){
        System.out.println("Persons Driving Audi Car" + " " + name + "," + model + "," + year);

    }
}
