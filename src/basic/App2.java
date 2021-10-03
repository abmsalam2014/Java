package basic;

public class App2 {

    public static void main(String[] args) {

        Students students1 = new Students("Kaushik", 3475930266l);
        Students students2 = new Students("Sanchoy", 3475930277l);

        System.out.println(students1.name + students1.cell + students2.name + students2.cell);
    }
}
