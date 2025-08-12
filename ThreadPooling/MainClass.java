

// Creating multiple threads for each task will create issues such as 
// high memory consumption,
// increased CPU context switching,
// potential system instability

public class MainClass extends Thread {

    public void run() {

        Number();
    }

    public void Number() {

        for (int i = 0; i < 5; i++) {
            System.err.println("Thread name: " + Thread.currentThread().getName() + " " + i);

            try {
                Thread.sleep(2000);
            } catch (Exception x) {
                x.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {

        MainClass t1 = new MainClass();
        MainClass t2 = new MainClass();
        MainClass t3 = new MainClass();

        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");

        t1.start();
        t2.start();
        t3.start();

    }
}
