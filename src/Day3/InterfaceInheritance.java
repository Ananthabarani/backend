package Day3;
interface vehical{
    void st();
}
interface FourWheeler{
    void numberofwheel();
}
interface twowheeler{
    void numberofwheel();
}
class car implements FourWheeler{
    public void st(){
        System.out.println("Car is starting");
    }
    public void numberofwheel(){
        System.out.println("Car has 4 wheels");
    }
}
class bike implements twowheeler{
    public void st(){
        System.out.println("Bike is starting");
    }
    public void numberofwheel(){
        System.out.println("Bike has 2 wheels");
    }
}
public class InterfaceInheritance {
    public static void main(String[] args) {
        car c=new car();
        c.st();
        c.numberofwheel();
        bike b=new bike();
        b.st();
        b.numberofwheel();
}
}