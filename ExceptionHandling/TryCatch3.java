import java.util.Scanner;
public class TryCatch3{
    public static void main(String[] args){

    System.out.println("------------------Program Start------------------");
          Scanner sc= new Scanner(System.in);
 
        try{
      
         int  a = sc.nextInt();       
        int b = 12;
        int arr[] = new int[5];

            System.out.println(arr[6]);
            System.out.println(a/b);
         
        }
         
        catch(ArithmeticException x){
                System.out.println(x);

               System.out.println("ArithmeticException  Eror aya he aya he !!!");
         }

        catch(ArrayIndexOutOfBoundsException x){
               System.out.println(x);

               System.out.println("ArrayIndexOutOfBoundsException Eror aya he aya he !!!");
        }
        catch(Exception e){
            System.out.println("Exception class can handle Checked and Unchecked data");
         }

            System.out.println("------------------Program Ends------------------");
    }
}