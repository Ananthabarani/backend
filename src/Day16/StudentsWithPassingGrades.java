package Day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class ExampleStudent {
    private String name;
    private int grade;

    public ExampleStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class StudentsWithPassingGrades {
    public static void main(String[] args) {

        List<ExampleStudent> list=new ArrayList<>();
        list.add(new ExampleStudent("Anand",70));
        list.add(new ExampleStudent("Barani",80));
        list.add(new ExampleStudent("Arun",60));
        list.add(new ExampleStudent("Akash",20));
        list.add(new ExampleStudent("Barath",50));

        print(list,(stu)->stu.getGrade()>=60);
    }

    public  static void print(List<ExampleStudent> list, Predicate<ExampleStudent> predicate) {
        for (ExampleStudent student : list) {
            if (predicate.test(student)) {
                System.out.println(student);
            }
        }

    }
}
