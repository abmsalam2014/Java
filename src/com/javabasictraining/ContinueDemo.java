package com.javabasictraining;

public class ContinueDemo {

    public static void main(String[] args) {

        for (int i = 1; i <= 100000; i++) {
            if (i == 2500){
                continue;
            }
            System.out.println(i);
        }
    }
}

        //i = 1; 11 <=10 (false) {if 7 == 6(false){
            //continue---
            //
            //i++ = i = 10+1=11
