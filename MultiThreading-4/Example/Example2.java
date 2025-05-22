
public class Example2 implements Runnable {

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("rice")) {
            rice();
        } else {
            VegetableChopped();
        }
    }

    public void rice() {
        System.out.println("Rice Cooking Start");
        try {

            Thread.sleep(1000);

            System.out.println("Rice Cooking Ends");
        } catch (Exception e) {

        }
    }

    public void VegetableChopped() {
        System.out.println("VegetableChopped Start");
        try {

            Thread.sleep(9000);

            System.out.println("VegetableChopped Ends");
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        Example2 sc = new Example2();

        Thread thread1 = new Thread(sc);
        Thread thread2 = new Thread(sc);

        System.out.println(Thread.currentThread().getName() + " start its execution");

        thread1.setName("rice");
        thread2.setName("vegetableChopped");

        thread1.start();
        thread2.start();

        try {

            // Main method will wait for VegetableChopped() to complete its execution
            // then only main method will ends its execution
            thread2.join();

        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }

        System.out.println(Thread.currentThread().getName() + " end its execution");
    }
}