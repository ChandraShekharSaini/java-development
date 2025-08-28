class Allocation {

    public static void maheshAcquireResource(String resource1, String resource2) {
        synchronized (resource1) {
            try {
                System.out.println("Rakesh acquired " + resource1);

                Thread.sleep(1000);

                synchronized (resource2) {
                    System.out.println("Rakesh acquired " + resource2);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void rakeshAcquireResource(String resource1, String resource2) {
        synchronized (resource2) {
            try {
                System.out.println("Mahesh acquired " + resource2);

                Thread.sleep(1000);

                synchronized (resource1) {
                    System.out.println("Mahesh acquired " + resource1);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Resource extends Thread {
    String resource1;
    String resource2;

    public Resource(String resource1, String resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        if (name.equals("rakesh")) {
            Allocation.maheshAcquireResource(resource1, resource2);
        } else {
            Allocation.rakeshAcquireResource(resource1, resource2);
        }
    }
}

public class DeadLock {

    public static void main(String[] args) {

        String playstation = "PlayStation";
        String tv = "TV";

        Resource r1 = new Resource(playstation, tv);
        Resource r2 = new Resource(playstation, tv);

        r1.setName("rakesh");
        r2.setName("mahesh");

        r1.start();
        r2.start();
    }
}
