package Day5.Generics;

public class Generic<K,V> {
   public  <K,V> void display(K k,V v){
       System.out.println(k);
       System.out.println(v);
   }

    public static void main(String[] args) {
        Generic<String,Integer> generic1=new Generic<>( );
        Generic<Integer,String> generic2=new Generic<>();
        generic1.display("Anand",12);
        System.out.println();
        generic2.display(12,"Anand");
    }
}
