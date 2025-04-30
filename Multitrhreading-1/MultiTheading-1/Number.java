public class Number extends Thread{

    public void run() {
        for (int i = 1; i <= 10; i++) {

            System.out.println(i);
            System.out.println("Numbers:"+ Thread.currentThread().getName());
            try {

                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
