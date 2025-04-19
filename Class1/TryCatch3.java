import java.util.Scanner;
import java.util.InputMismatchException;

public class TryCatch3{
    public static void main(String[] args){

    try{
           int a = 12;

           Scanner sc = new Scanner(System.in);
           int  c = sc.nextInt();
          
           System.out.println(a/c);
    }
    catch(ArithmeticException e){
        System.out.println(e);

        System.out.println("Arithmetic error aya he!!");
    }
    catch(InputMismatchException e){

         System.out.println(e);
        System.out.println("InputMismatched aaya he!!!");
    }
 
    }
}