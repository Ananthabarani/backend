//Create an abstract class Appliance with methods turnOn() (abstract) and turnOff() (non-abstract).
// Derive a class Fan and implement turnOn().

package Day3.AbstractClass;

abstract class Appliance {
    abstract  String turnon(String s);
     void turnoff(){

     }
}
class Fan extends Appliance{
    String turnon(String s){
       return s;
    }
    public static void main(String[] args) {
        Fan fan=new Fan();
        System.out.println( fan.turnon("Runing"));
    }
}
