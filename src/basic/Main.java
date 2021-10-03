package basic;

public class Main {

    public static void main(String[] args) {

//        Human human1 = new Human();
//        System.out.println(human1.name);

        Human human1 = new Human("Mehedi", 22, 100, 123);
        Human human2 = new Human("John", 23, 100,123);
        Human human3 = new Human("Kabir", 35, 202, 234);

        System.out.println("Human1 name:" + human1.name +human1.age + human1.weight + human1.ssn + human1.company);
        System.out.println("Human2 name:" + human2.name +human2.age + human2.weight + human2.ssn + human1.company );
        System.out.println("Human3 name:" + human3.name +human3.age + human3.weight + human3.ssn + human3.company );






    }

}
