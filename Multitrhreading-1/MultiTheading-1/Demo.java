import java.util.Scanner;
public class Demo extends Thread {

    public void run() {

        add();

    }

    public void add() {
        System.out.println("Demo Method Thraed:" + Thread.currentThread().getName());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();

        System.out.println("Enter b:");
        int b = sc.nextInt();

        System.out.println("Sum of a and b:" + a + b);
    }

//    public void sub(){
//        System.out.println("Demo Method Thraed:"+ Thread.currentThread().getName());
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a:");
//        int a = sc.nextInt();
//
//        System.out.println("Enter b:");
//        int b = sc.nextInt();
//
//        System.out.println("Sum of a and b:" + a + b);
//    }

    public static void main(String[] args) {

        System.out.println("Main Method:" + Thread.currentThread().getName());

        Demo demo = new Demo();
        // demo.add();
        // demo.run();
        demo.start();

        Number num = new Number();
        // sc.numbers();
        // num.run();
        num.start();

        Alphabets alphabets = new Alphabets();
        // alphabets.alpha();
        // num.run();

        alphabets.start();
    }
}


