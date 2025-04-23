import java.io.IOException;
import java.util.Scanner;
public class ATM {

    public static void  accept() throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        int password = sc.nextInt();
        System.out.print("Enter username:");
        int username = sc.nextInt();
        Bank1 bank = new Bank1();
        bank.checkUser(username , password);
    }



    public static void main(String[] args) throws Exception{

        try{
            accept();
        }

        catch(Exception e){
            System.out.println(e.getMessage() +"Only 2 chance remaining");
             try{
                 accept();
             }

             catch(Exception e1){
                 System.out.println(e.getMessage() + "Only 1 chance remaining");
                 
                 try{
                     accept();
                 }
                 
                 catch(Exception e2){
                     System.out.println(e2.getMessage() + "ATM  Blocked");
                     System.out.println("Kindly Visit to near Bank Branch");
                 }
             }
        }
    }
}
