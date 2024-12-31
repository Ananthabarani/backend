//Create a base class Animal with a method sound().
// Derive two classes Dog and Cat from Animal. Override the sound() method to print “Bark” for Dog and “Meow” for Cat.

package Day3.BasicInheritance;


class Animal{
    void sound(){
        System.out.println("Animal sound");
    }
}
class Dog {
    void sound(){
        System.out.println("Bark");
    }
}
class Cat {
    //@Override
    void sound() {

        System.out.println("Meow");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
     Cat cat=new Cat();
     Dog dog=new Dog();
     cat.sound();
     dog.sound();;
    }
}
