//Create a Student class with fields name and marks.
// Write an instance method displayStudentDetails in the Student class to print the student's details.
// Use a method reference to call this method for each student in a list.
package Day17.MethodReference;
import java.util.ArrayList;
import java.util.List;

class Students{
    private String name;
    private int marks;

    public Students(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public void displayStudentDetails() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}

public class StudentDetails{
    public StudentDetails() {
        List<Students> students = new ArrayList<>();
        students.add(new Students("Gnana", 78));
        students.add(new Students("Bala", 67));
        students.add(new Students("jeeva", 80));

        students.forEach(Students::displayStudentDetails);
    }
    public static void main(String[] args) {
        StudentDetails studentDetails=new StudentDetails();
    }
}

