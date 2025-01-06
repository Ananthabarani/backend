package Day7;// Write a Java program to demonstrate the use of reflection. Your program should:
//Dynamically load a custom class (e.g., Day7.Person) using its fully qualified name.
//Display the following details about the class:
//All declared methods and their return types.
//All declared fields and their types.
//All constructors.
//Dynamically invoke a method on an object of the class, provided the method name and arguments as input.

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("Day7.Person");
            Constructor [] constructors = cls.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                System.out.println("Constructor: " + constructor);
            }
            Person person=(Person) constructors[1].newInstance("Anand",21);
            System.out.println("Created Day7.Person: " + person);

            Field[] fields = cls.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("Field: " + field.getName());
            }

            Method[] methods = cls.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("Method: " + method.getName());
                if (method.getName().equals("personDetails")) {
                    method.invoke(person, 2000.00);
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}