public class States extends Thread {
    public void run() {
        System.out.println("--------" + Thread.currentThread().getName()
                + Thread.currentThread().getState() + "---------");
    }

    public static void main(String[] args) {

        States thread1 = new States();
        States thraed2 = new States();

        System.out.println("State of Thread One:" + thread1.getState());
        System.out.println("States of Thread Two:" + thraed2.getState());

        thread1.start();

        System.out.println("States of Thread One:" + thread1.getState());
        System.out.println("States of Thread Two:" + thraed2.getState());

        thraed2.start();
    }
}
