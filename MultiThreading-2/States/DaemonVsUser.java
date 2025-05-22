public class DaemonVsUser extends Thread {

    @Override
    public void run() {
        if (Thread.currentThread().getState().equals("num")) {
            num();
        } 
        else if(Thread.currentThread().getState().equals("alpha")){
            alpha();
        }
        else {
           nums();
        } 
    }

    public void num() {
        for (;;) {
            System.out.println("Running");

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();

                e.getMessage();
            }
        }
    }

     public void nums() {
        for (int i=0;i<=20;i++) {
            System.out.println("0"+i);

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();

                e.getMessage();
            }
        }
    }

    public void alpha() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
                e.getMessage();
            }
        }
    }

    public static void main(String[] args) {

        DaemonVsUser thraed1 = new DaemonVsUser();
        DaemonVsUser thraed2 = new DaemonVsUser();
        DaemonVsUser thraed3 = new DaemonVsUser();

        thraed1.setName("num");
        thraed2.setName("alpha");
        thraed3.setName("nums");

        thraed1.setDaemon(true);
        thraed1.start();
        thraed2.start();
        thraed3.start();

    }
}
