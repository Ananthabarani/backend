package Day2;

public class Student {
    private String name;
    private int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
        void display(){
        System.out.println("Name: "+name);
        System.out.println("Age : "+age );
    }

    public static void main(String[] args) {
        Student student=new Student("Anand",21);
        student.display();
    }
}
