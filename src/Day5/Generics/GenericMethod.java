package Day5.Generics;

public class GenericMethod {
    public static <T> void printArray(T t[]){
        for(T t1:t){
            System.out.print(t1+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Integer[] {1,2,3});
        printArray(new Double[] {1.0,2.0,3.0});
        printArray(new String[] {"anand","Barani","Barath"});
    }
}
