package com.javabasictraining;

public class Clothing {

    public double price;

    public static void main(String[] args) {
        Clothing clothing = new Clothing();
        clothing.setPrice(12);
        System.out.println(clothing.price);
        //clothing.getPrice(1.0);
    }


    public void setPrice(double newPrice) {
        double fee = 10;
        price = newPrice + fee;

        if (price > 20) {
            double discount = 0.5;
            price = price - fee * discount;
        }
    }

    public double getPrice() {
        int fee = 5;
        price = price - fee ;
        return price;
    }

}
