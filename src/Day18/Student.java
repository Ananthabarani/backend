package Day18;

import java.util.List;

public class Student {
    private String name;
    private List<Integer> marks;
    private String grade;
    private String department;

    public Student(String name, List<Integer> marks, String department) {
        this.name = name;
        this.marks = marks;
        this.department = department;
        this.grade = "";
    }

    public String getName() {
        return name;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDepartment() {
        return department;
    }

    public double getAverageMarks() {
        return marks.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + '\'' + ", averageMarks=" + getAverageMarks() + ", grade='" + grade + '\'' + '}';
    }
}