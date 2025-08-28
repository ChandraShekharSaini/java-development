import java.lang.Thread.State;

public class Example implements Runnable {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        if (name.equals("num")) {
            num();
        } else {
            alpha();
        }
    }

    public static void num() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.print(i + " ");
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void alpha() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.print((char) (i + 65) + " "); // A–J
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        Example sc = new Example();

        // Give thread names explicitly
        Thread t1 = new Thread(sc, "num");
        Thread t2 = new Thread(sc, "alpha");

        t1.start();
        t2.start();
    }
}
