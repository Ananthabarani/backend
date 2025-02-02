//Create a Generic Box class that can hold a single object of any type. The class should:
//Be able to store any type of object, whether it's a String, Integer, Double, or any custom class.
//Provide methods to:
//setItem(T item): Store an item in the box.
//getItem(): Retrieve the stored item.
//printItem(): Print the item stored in the box.
//Implement a method to check if the stored item is of a specific type, for example, using instanceof.
package Day11.Generic;
public class GenericBox<T> {
    private T item;
    public void setItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
    public void printItem() {
        if (item != null) {
            System.out.println("Item in the box: " + item.toString());
        } else {
            System.out.println("The box is empty.");
        }
    }
    public boolean isOfType(Class<?>  item) {
        return item.isInstance(item);
    }

    public static void main(String[] args) {
        GenericBox<String> str = new GenericBox<>();
        str.setItem("Hello, World!");
        str.printItem();
        System.out.println("Is item a String? " + str.isOfType(String.class));

        GenericBox<Integer> integer = new GenericBox<>();
        integer.setItem(42);
        integer.printItem();
        System.out.println("Is item an Integer? " + integer.isOfType(Integer.class));

        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.setItem(3.14);
        doubleBox.printItem();
        System.out.println("Is item a Double? " + doubleBox.isOfType(Double.class));

        GenericBox<Object> customBox = new GenericBox<>();
        customBox.setItem(new Object());
        customBox.printItem();
        System.out.println("Is item an Object? " + customBox.isOfType(Object.class));
    }
}
