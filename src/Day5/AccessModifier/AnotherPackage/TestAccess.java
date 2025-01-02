package Day5.AccessModifier.AnotherPackage;
import Day5.AccessModifier.PackageTwo.*;

public class TestAccess  {

    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.name);
        System.out.println();
        Employee employee=new Employee();
        employee.display();
    }
}
