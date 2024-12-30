package Day3;


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
