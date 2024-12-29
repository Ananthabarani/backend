package Day2;

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
