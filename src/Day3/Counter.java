package Day3;

public class Counter {
    private static int count=0;
    public  Counter(){
        count++;
        System.out.println("Count : "+ count);
    }

    public static void main(String[] args) {
        Counter obj1=new Counter();
        Counter obj2=new Counter();
        Counter obj3=new Counter();

    }
}
