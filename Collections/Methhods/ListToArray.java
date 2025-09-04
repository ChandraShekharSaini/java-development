
import java.util.ArrayList;
import java.util.List;


public class ListToArray {
   public static void main(String[] args){
      
    List<String> sc = new ArrayList<>();
    sc.add("A");
    sc.add("B");
    sc.add("C");
    sc.add("D");

    Object[] arr = sc.toArray();
    


 for(Object x:arr){
    System.out.println(x);
 }

   }
}
