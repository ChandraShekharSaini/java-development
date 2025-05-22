public class Sample implements Runnable {
    synchronized public void run() {
        String name = Thread.currentThread().getName();

        System.out.println(name + "is started printing");

        for (int i = 0; i <= 5; i++) {
            System.out.println(name + " is printing " + i);

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();

                e.getMessage();
            }
        }

        System.out.println(name + " is stopped printing");
    }

    public static void main(String[] args) {
        // Sample thread1 = new Sample();
        // Sample thread2 = new Sample();
        // Sample thread3 = new Sample();

        // thread1.setName("rakesh");
        // thread2.setName("ramesh");
        // thread3.setName("suresh");

        // thread1.start();
        // thread2.start();
        // thread3.start();

        Sample sample = new Sample();

        Thread th1 = new Thread(sample);
        Thread th2 = new Thread(sample);
        Thread th3 = new Thread(sample);

        th1.setName("rakesh");
        th2.setName("ramesh");
        th3.setName("suresh");

        th1.start();
        th2.start();
        th3.start();

    }

}
