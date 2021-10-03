package javabasictraining;


import java.util.Scanner;


public class Calculator {

    public static void main(String[] args) {

        System.out.println("Welcome to Calculator");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter start year");

        int a = input.nextInt();

        System.out.println("Please enter todays year");

        int b = input.nextInt();

        int substrcation = a-b;

        System.out.println("Result = " + substrcation);

    }





}
