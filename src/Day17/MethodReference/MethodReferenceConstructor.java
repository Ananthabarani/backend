/*Create a functional interface StudentFactory that contains a method create(String name, int marks).
Use a constructor reference to implement this method to create Student objects.*/
package Day17.MethodReference;

class Student{
    String name;
    int mark;

    Student(String name, int mark){
        this.mark=mark;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student[" + " Name = " + name + ", Mark = " + mark + "]";
    }

    @FunctionalInterface
    interface StudentFactory{
        Student create(String name,int mark);
    }
}
public class MethodReferenceConstructor {
    public static void main(String[] args) {
        Student.StudentFactory factory = Student::new;
        Student s1 = factory.create("Anand",90);
        Student s2 = factory.create("Barani",50);
        System.out.println(s1);
        System.out.println(s2);
    }
}
