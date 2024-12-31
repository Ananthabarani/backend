//Create a class Book with default values for title and author.
// Write a default constructor to initialize these attributes.
package Day2.Constructors;

public class Book {
    private  String title;
    private String name;
    Book(){
        this.title="Java8";
        this.name= "Anand";
    }

    public static void main(String[] args) {
        Book b1=new Book();
        System.out.println("Title :"+ b1.title+" " + "Name :"+b1.name);
    }
}
