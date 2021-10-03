package oops.encapsulation;

public class EncapsulationTest {


    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setFirstName("Mehedi");
        employee.setLastName("Aziz");
        employee.setDateOfBirth("10112");
        employee.setAge(34);
        employee.setSsn(1256413);
        employee.setAddress("Newark Delaware");



        System.out.println("Full Name= " + employee.getFirstName() + " " + employee.getLastName() +  "," + "Age=" + employee.getAge());
        System.out.println(employee.getLastName());
        System.out.println(employee.getDateOfBirth());
        System.out.println(employee.getAge());
        System.out.println(employee.getSsn());
        System.out.println(employee.getAddress());




    }
}
