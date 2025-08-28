
class Printer {
    synchronized public static void print(String name) {

        System.out.println(name + " is started printing");

        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println(name + " is printing " + i);
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println(name + " is end printing");
    }
}

class User extends Thread {

    Printer printer;
    String userName;

    public User(Printer printer, String userName) {
        this.printer = printer;
        this.userName = userName;
    }

    public void run() {
        Printer.print(userName);
    }
}

public class SynchronizationDemo {

    public static void main(String[] args) {

        Printer printer = new Printer();

        User t1 = new User(printer, "Rakesh");
        User t2 = new User(printer, "Mahesh");
        User t3 = new User(printer, "Suresh"); // new state

        t1.start(); // runnable or runnning state
        t2.start();
        t3.start();
    }
}
