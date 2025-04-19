import java.lang.reflect.Array;
public class Sample {

    //Main method in MainSample File
    public void add() {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Error Aaya he!!!");
        }
    }

    public void sub() {

        try {
            int arr[] = {10,20};
            System.out.println(arr[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Error ArrayIndexOutOfBoundsException  Aaya he!!!");
        }
    }
}


