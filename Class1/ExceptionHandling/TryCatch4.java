

package  ExceptionHandling;

import java.util.Scanner;
import java.util.InputMismatchException;

public class TryCatch4{
    public static void main(String[] args){

    System.out.println("--------------Execution Start--------------");

    try{
           int a = 12;

           Scanner sc = new Scanner(System.in);
           int  c = sc.nextInt();

           int arr[] = new int[5];

           System.out.println(arr[6]);
          
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
    catch(Exception e){
        System.out.println(e);
        System.out.println("I will handle Both Checked and Uncheked Exception");
    }

    System.out.println("--------------Execution Ends--------------");
 
    }
}