package com.javabasictraining;

public class MethodDemo {

    // how to write a method()
    // how to overload the method (*Interview questions- Method overloading possible-only same method name but different parameters or signatures)
    public static void main(String[] args) {
        welcome();
        sum(5, 6);
        sum(5, 6.0);
        sum(5, 6, "hello");
        eat("beef burger");
        drive("honda");

    }
    public static void welcome() {
        System.out.println("Welcome to Calculator");
    }
    public static void sum(int a, int b) {
        System.out.println("This is Addition:" + (a + b));
    }
    public static void sum(int c, double d) {
        System.out.println("This is multiflication:" + (c * d));
    }
    public static void sum(double e, double f, String g) {
        System.out.println("This is Division:" + (e / f) + g);
    }
    public static void eat(String name){
        System.out.println("I eat burger:" + " " + name);
    }
    public static void drive(String name){
        System.out.println("I drive car:" + " " + name);
    }
}