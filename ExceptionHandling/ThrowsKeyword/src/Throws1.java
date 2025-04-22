public class Throws1 {


public static void add() throws  Exception {

    try{
        System.out.println("Hello World");

        System.out.println(10/0);
    }
    catch(Exception e){
        System.out.println(e);

        throw  new ArithmeticException("ArithmeticException Aaya He !!!!");
    }
    finally {
        System.out.println("Finally");
    }
}


    public static void sub() throws  Exception {

        System.out.println("Program Starts");

         int[] arr = {10,20,30,40};

         System.out.println(arr[4]);

        System.out.println("Program Ends");
    }
}


