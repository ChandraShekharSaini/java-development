public class Alphabets {

    public void alpha() {
        System.out.println("-------------alpha is executing-------------");
        for (int i = 65; i <= 75; i++) {
            System.out.println((char) i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
