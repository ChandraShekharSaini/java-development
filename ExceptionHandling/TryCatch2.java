public class TryCatch2{
    public static void main(String[] args){

    System.out.println("------------------Program Start------------------");

      int[] arr  = {10,20,30};

        try{
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException x){
               System.out.println(x);

               System.out.println("ArrayIndexOutOfBoundsException Eror aya he aya he !!!");
        }
        finally{
            System.out.println("Deko me kaam karu ga kese be haal me");
            System.out.println("Chahe try or catch kaam kare ya na kare , per me kaam karu ga");
        }

            System.out.println("------------------Program Ends------------------");
    }
}