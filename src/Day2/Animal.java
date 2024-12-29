package Day2;

public class Animal {
    void speak(){
        System.out.println("From Animal class:");
    }
}
class Dog extends Animal{
    void speak(){
        System.out.println("Barking");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("meoww");
    }
}
class Sound{
    public static void main(String[] args) {
        Cat cat=new Cat();
        Dog dog=new Dog();
        cat.speak();
        dog.speak();
    }
}
