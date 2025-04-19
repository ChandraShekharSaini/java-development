import java.util.*;
        import java.util.*;

public class TryCatch1{
    public static void main(String[] args){

        System.out.println("------------Program Start-------");

        int a = 12;
        int b = 0;

        int arr[] = {12,13,14,15};
   
        try{
           System.out.println(a/b);

        }
        catch(ArithmeticException error){
        System.out.println("Error aya he Bro");

        System.out.println(error);
        }

        System.out.println("------------Program Ends-------");
        
    }
}