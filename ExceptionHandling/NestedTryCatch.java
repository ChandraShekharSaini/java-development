
public class NestedTryCatch {
    public static void main(String[] args) {
 System.out.println("--------------Program Starts-----------------------------");
        try{
             System.out.println(10/5); //2
            try{
                int[] arr = {10,};
                System.out.println(arr[0]); //10
                System.out.println(arr[1]); //Error

            }
            catch(ArrayIndexOutOfBoundsException x){
                 System.out.println(x); //java.lang.ArrayIndexOutOfBoundsException: 1
                 System.out.println("Index Exceeds"); // Index Exceeds
            }
        }
        catch(ArithmeticException e) {
            System.out.println(e);
            System.out.println("ArithmeticException caught");
        }

        System.out.println("--------------Program Ends-----------------------------");
    }
}