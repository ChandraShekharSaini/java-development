import java.util.Scanner;

public class Add implements Runnable {

    public void run() {
        System.out.println("------" + Thread.currentThread().getName() + "------");
        add();
    }

    void add() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();

        System.out.println(a + b);
    }

}
