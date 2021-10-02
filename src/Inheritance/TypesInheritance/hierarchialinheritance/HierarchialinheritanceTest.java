package Inheritance.TypesInheritance.hierarchialinheritance;

public class HierarchialinheritanceTest {
    public static void main(String[] args) {
        Human_B human_b = new Human_B();
        human_b.religion();
        human_b.engineer();

        Human_C human_c = new Human_C();
        human_c.religion();
        human_c.driving();

        Human_D human_d = new Human_D();
        human_d.religion();
        human_d.gardening();


    }

}
