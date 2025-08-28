
public class LifeCycle extends Thread {

    @Override
    public void run() {

        String name = Thread.currentThread().getName();

        if (name.equals("Thraed1")) {
            num();
        } else {
            alpha();
        }

    }

    public void num() {
        System.out.println(Thread.currentThread().getState());
        for (int i = 0; i < 10; i++) {

            try {
                System.out.println(i);
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

        LifeCycle l1 = new LifeCycle();
        LifeCycle l2 = new LifeCycle();

        System.out.println("Thraed1 " + l1.getState()); // NEW
        System.out.println("Thread2 " + l2.getState());

        l1.setName("Thraed1");
        l2.setName("Thread2");
        l1.start();
        l2.start();

        System.out.println("Thraed1 " + l1.getState()); // RUNNABLE
        System.out.println("Thraed2 " + l2.getState());
    }
}
