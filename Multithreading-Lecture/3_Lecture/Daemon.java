public class Daemon extends Thread {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        if (name.equals("Thread1")) {
            num();
        } else {
            alpha();
        }
    }

    public void num() {
        System.out.println("Daemon thread state: " + Thread.currentThread().getState());
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Daemon running num(): " + i);
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void alpha() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("User thread alpha(): " + (char) (i + 65));
                Thread.sleep(1500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        Daemon t1 = new Daemon();  // Daemon thread
        Daemon t2 = new Daemon();  // User thread

        t1.setName("Thread1");
        t2.setName("Thread2");

        t1.setDaemon(true); // mark t1 as daemon

        t1.start();
        t2.start();

        System.out.println("Main thread ends...");
    }
}
