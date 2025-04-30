public class Demo implements Runnable {

    @Override
    public void run() {
        System.out.println("------" + Thread.currentThread().getName() + "------");
        System.out.println();
        alpha();

    }

    void alpha() {
        for (int i = 65; i <= 75; i++) {

            System.out.println((char) i);
            try {

                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {

        Demo demo = new Demo();
        Thread kaam1 = new Thread(demo);
        kaam1.start();

        PrintArray prinntarray = new PrintArray();
        Thread kaam2 = new Thread(prinntarray);
        kaam2.start();

        Numbers num = new Numbers();
        Thread kaam3 = new Thread(num);
        kaam3.start();

        Add add = new Add();
        Thread kaam4 = new Thread(add);
        kaam4.start();

    }
}