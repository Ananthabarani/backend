//Instance Method Reference Create a program where a method reference
// is used to compare strings (e.g., String::compareToIgnoreCase) in a list and sort them.
package Day17.MethodReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class CompareString {
    public  CompareString(){
        List<String > words= Arrays.asList("gnana","Aathi","jeeva","Dhanush");
        Collections.sort(words,String::compareToIgnoreCase);
        for(String str:words){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        CompareString c=new CompareString();
    }
}
