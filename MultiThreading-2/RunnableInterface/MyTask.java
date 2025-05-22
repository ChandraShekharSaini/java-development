import java.util.Scanner;

public class MyTask implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        printNum();
    }

    void printNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();

        System.out.println("Result:" + (a - b));

    }

    public static void main(String[] argaStrings) {
        MyTask num = new MyTask();
        Thread kaam1 = new Thread(num);
        kaam1.start();

        PrintBottle print1=  new PrintBottle();
        Thread kaam2 = new Thread(print1);
        kaam2.start();

    }
}