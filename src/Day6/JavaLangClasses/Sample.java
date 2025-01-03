//Create a program that demonstrates:
//Creating an object of a class.
//Using the basic methods of the Object class: getClass() and toString().

package Day6.JavaLangClasses;

public class Sample {
    private final String s;

    public Sample(String s){
       this.s=s;
   }
//   @Override
//   public String toString(){
//        return s;
//   }
    public static void main(String[] args) {
        Sample sample=new Sample("Anand");
        System.out.println(sample.getClass());
        System.out.println(sample.toString());
    }
}
