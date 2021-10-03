package javabasictraining;


public class ReturnStatement {

    public static void main(String[] args) {

        //void = no return

        printWelcome();
        int sum = add(1,2);
        System.out.println(sum);
        sum(2,3);

    }
    public static void printWelcome(){
        System.out.println("Welcome to Retun Statement Java Class");
    }
    //return statement
    public static int add(int a, int b){
        return a + b;
    }

    //method
    public static void sum(int a, int b){
        System.out.println(a+b);
    }





}
