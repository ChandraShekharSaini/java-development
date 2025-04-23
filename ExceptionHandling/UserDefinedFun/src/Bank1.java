import java.util.Scanner;
public class Bank1 {

      private  int un = 1111;
      private  int pass = 2323;

      public void checkUser(int un , int pass) throws Exception {
          if(un == this.un && pass == this.pass) {
              System.out.println("Money Widdrawn Successfully......");
          }
          else{
              throw new InvalidDetailsException ("Wrong Credentials !! Try Again");
          }
      }



      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          try{
              System.out.print("Enter the username:");
              int un = sc.nextInt();
              System.out.print("Enter the amount to withdraw:");
              int pass = sc.nextInt();
              Bank1 b = new Bank1();
              b.checkUser(un , pass);

          }

          catch(Exception e){

              e.printStackTrace();

              System.out.println(e.getMessage());
          }
      }

}
