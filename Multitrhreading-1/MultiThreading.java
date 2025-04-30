
import java.util.*;

public class MultiThreading {

    public void add() {
        System.out.println("-------------add is executing-------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter num2:");
        int num2 = sc.nextInt();

        System.out.println("Sum of Two number: " + num1 + num2);
    }


    public static void main(String[] args) {
        MultiThreading obj = new MultiThreading();
        obj.add();
        Numbers num = new Numbers();
        Alphabets alphabet = new Alphabets();
        num.number();
        alphabet.alpha();
    }

}
