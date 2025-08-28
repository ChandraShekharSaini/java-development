public class Example {
    public static void main(String[] args) {

        Thread t = Thread.currentThread();

        System.out.println(t);

        t.setName("Chnadra");

        try {
            Thread.sleep(2000);
        } catch (Exception x) {
            x.printStackTrace();
        }

        System.out.println(t);

    }
}