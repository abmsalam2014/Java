package oops.polymorphism.compiletime.polymorphism;

public class Insurance {

    public void insurance(String name){
        System.out.println("You have to pay 100%");
    }

    public void insurance(String name, String name2){
        System.out.println("You have to pay 80%");

    }

    public void insurance(String name, String name1, String name2){
        System.out.println("You have to pay 70%");
    }



}
