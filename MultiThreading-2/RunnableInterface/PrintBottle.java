

public class PrintBottle implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        printBottleNum();

    }

    void printBottleNum() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Bottle Number:" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }
}
