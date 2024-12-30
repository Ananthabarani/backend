package Day3;


    class Person{
        public String name;
        public int age;
        Person (String name,int age){
            this.name=name;
            this.age=age;
        }
        public void display(){
            System.out.println("Name : "+name );
            System.out.println("Age : "+age);
        }
    }
    class  Student extends Person{
        public int rollno;
        public int mark;
        Student(String name,int age,int rollno,int mark){
            super(name,age);
            this.rollno=rollno;
            this.mark=mark;
        }
        public  void display(){
            super.display();
            System.out.println("Rollno : "+rollno);
            System.out.println("Mark : "+mark);
        }
    }
public class BasicInheritance {
    public static void main(String[] args) {
        Student stu=new Student("anand",21,1234,420);
        System.out.println("Student Details : ");
        stu.display();
    }
}
