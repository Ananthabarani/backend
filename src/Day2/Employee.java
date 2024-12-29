package Day2;

public class Employee {
    private int id;
    private String name;
    private  double salary;
    Employee( int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
     void display(){
         System.out.println("id: "+id);
         System.out.println("Name: "+name);
         System.out.println("Salary: "+salary);
     }

    public static void main(String[] args) {
        Employee employee=new Employee(1234,"Anand",100000);
        employee.display();
    }
}
