public class Alphabets extends  Thread{

    public void run() {
        for (int i = 65; i <= 75; i++) {
            System.out.println("Alphabets Method Thraed:"+ Thread.currentThread().getName());
            System.out.print((char) i);
            try {

                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
