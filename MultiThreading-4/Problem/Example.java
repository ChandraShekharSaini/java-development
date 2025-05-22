

//Condition of Thread Lock
public class Example implements Runnable {

    String resource1 = "TV";
    String resource2 = "PlayStation";

    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        if (name.equals("Rajesh")) {
            rajeshAcqireResource();
        } else {
            maheshAcqireResource();
        }
    }

    public void rajeshAcqireResource() {
        synchronized (resource1) {
            try {

                System.out.println("Rajesh acquired Play Statin");
                Thread.sleep(1000);
                synchronized (resource2) {
                    System.out.println("Rajesh acquired TV");
                    Thread.sleep(1000);
                }
            } catch (Exception x) {
                x.printStackTrace();
            }
        }
    }

    public void maheshAcqireResource() {
        synchronized (resource2) {
            try {

                System.out.println("Mahesh acquired TV");
                Thread.sleep(1000);
                synchronized (resource1) {
                    System.out.println("Mahesh acquired PlayStation");
                    Thread.sleep(1000);
                }
            } catch (Exception x) {
                x.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Example sc = new Example();

        Thread thread1 = new Thread(sc);
        Thread thread2 = new Thread(sc);

        thread1.setName("Rajesh");
        thread2.setName("Mahesh");

        thread1.start();
        thread2.start();

    }
}