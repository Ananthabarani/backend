package Day7;

public class Person {
    String name;
    int age;

    Person() {}

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void personInfo(double sal) {
        System.out.println("Salary: " + sal);
    }
}