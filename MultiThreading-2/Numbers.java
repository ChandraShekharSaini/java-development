
public class Numbers implements Runnable {

    @Override
    public void run() {
        System.out.println("------" + Thread.currentThread().getName() + "------");
        numbers();
    }

    void numbers() {
        for (int i = 1; i <= 5; i++) {

            System.out.print(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }
}