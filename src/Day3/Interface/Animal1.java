//Create an interface Animal with methods eat() and sleep().
//Implement this interface in classes Dog and Cat
package Day3.Interface;

public interface Animal1 {

     void eat();

     void sleep();
}
class Cat1 implements  Animal1{
     public void eat(){
          System.out.println("Cat eating");
     }
     public void sleep(){
          System.out.println("Cat Sleeping");
     }
}
class Dog1 implements  Animal1{
     public void eat(){
          System.out.println("Dog eating");
     }
     public void sleep(){
          System.out.println("Dog Sleeping");
     }

     public static void main(String[] args) {
          Dog1 dog1=new Dog1();
          Cat1 cat1=new Cat1();
          dog1.eat();
          dog1.sleep();
          cat1.eat();
          cat1.sleep();


     }
}
