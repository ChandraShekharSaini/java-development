public class Example extends Thread {

    public void run() {
        String name = Thread.currentThread().getName();

        System.out.println(name + " is started printing");

        for (int i = 1; i <= 20; i++) {
            try {
                System.out.println(name + " is printing " + i);
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println(name + " is end printing");
    }

    public static void main(String[] args) {
        Example t1 = new Example();
        Example t2 = new Example();
        Example t3 = new Example(); //new state

        t1.setName("Rakesh"); 
        t2.setName("Mahesh");
        t3.setName("Suresh");   

        t1.start(); //runnable or runnning state
        t2.start();
        t3.start();
    }
}
