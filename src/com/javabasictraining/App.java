package com.javabasictraining;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        String userName = "Khokoninny@yahoo.com";
        String passWords;
        String passWord = "Hello123";

        System.out.println("User Name:" + " " + userName);

        for (int i = 1; i <= 3; i++) {

            System.out.println("Please Enter your password....");
            Scanner input = new Scanner(System.in);
            passWords = input.nextLine();//Getting String from keyBoard.

            if (passWords.equals(passWord)) {
                System.out.println("Welcome; enjoy your java class...");
            } else if (passWords!= passWord) {
                System.out.println("Sorry; 1 try. Please try again...");
            } else if (passWords == passWord) {
                System.out.println("Sorry; 2 try again...");
            } else {
                System.out.println("Sorry; 3 try, Please See your Admin");
            }

        }
    }
}
