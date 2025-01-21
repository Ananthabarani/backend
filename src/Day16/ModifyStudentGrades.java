//Modify Student Grades
//Write a program that accepts a Consumer<Student> to increase each student's grade by 10.
// Define a Student class and modify a list of Student objects.

package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class ExampleStudents {
    private String name;
    private int grade;

    public ExampleStudents(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public  void addgrade(){
        grade=grade+10;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class ModifyStudentGrades {
    public static void main(String[] args) {

        List<ExampleStudents> list=new ArrayList<>();
        list.add(new ExampleStudents("Anand",70));
        list.add(new ExampleStudents("Barani",80));
        list.add(new ExampleStudents("Arun",60));
        list.add(new ExampleStudents("Akash",20));
        list.add(new ExampleStudents("Barath",50));

        print(list,(stu)->stu.addgrade());
    }

    public  static void print(List<ExampleStudents> list, Consumer<ExampleStudents> consumer) {
        for (ExampleStudents student : list) {
            consumer.accept(student);
            System.out.println(student.getName()+ ":"+ student.getGrade());
        }

    }
}
