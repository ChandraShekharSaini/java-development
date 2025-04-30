public class Thread1 {

    public static void main(String[] args) {

        Thread.currentThread();

        System.out.println(Thread.currentThread());

        Thread t = Thread.currentThread();
        t.setName("Chandra");

        System.out.println(t);

        System.out.println(10/0);


        System.out.println("Hello World");
    }
}
