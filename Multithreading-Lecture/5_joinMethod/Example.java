
public class Example implements Runnable {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        try {
            System.out.println(name + " Hello");
            Thread.sleep(1000);
            System.out.println(name + " Hello");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        // main Thraed
        Example e = new Example();

        Thread t1 = new Thread(e);
        Thread t2 = new Thread(e);

        System.out.println(Thread.currentThread().getName() + " Thread start execution");

        t1.start(); // Thraed 0
        t2.start(); // Thread 1

        try {
            // join() ensure that Thread 0 and 1 will  end there execution beore main thread end
            t1.join();
            t2.join();

        } catch (InterruptedException x) {
            x.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " Thread end execution");

    }
}
