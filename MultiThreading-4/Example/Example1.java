
public class Example1 implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i <= 2; i++) {
            System.out.println("Hello");
        }

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();

            e.getMessage();
        }

    }

    public static void main(String[] args) {
        Example1 sc = new Example1();

        Thread thread1 = new Thread(sc);

        System.out.println(Thread.currentThread().getName() + " start its execution");

        thread1.start();

        try {
            thread1.join();
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }

        System.out.println(Thread.currentThread().getName() + " end its execution");
    }
}