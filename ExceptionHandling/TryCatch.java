public class TryCatch{
    public static void main(String[] args){

    System.out.println("------------------Program Start------------------");

         int a = 9;
         int b  = 0;

        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException x){
               System.out.println(x);

               System.out.println("ArithmeticException Eror aya he aya he !!!");
        }
        finally{
            System.out.println("Deko me kaam karu ga kese be haal me");
            System.out.println("Chahe try or catch kaam kare ya na kare , per me kaam karu ga");
        }

            System.out.println("------------------Program Ends------------------");
    }
}