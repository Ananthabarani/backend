//Create a class Student with fields for the name and age.
// Write a program to create a clone (copy) of a Student object using the clone() method.

package Day6.JavaLangClasses;

public class Student implements Cloneable{
    private String name;
    private int age;
    public Student(String s,int n){
        this.name=s;
        this.age=n;
    }

    public static void main(String[] args) {

        try{
            Student student1=new Student("anand",5);
            Student student2=(Student) student1.clone();
            System.out.println(student1.name + " "+ student1.age);
            System.out.println(student2.name + " "+ student2.age);
        }
        catch (Exception e){
            System.out.println("Exception on clon");
        }


    }
}
