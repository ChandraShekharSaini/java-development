import java.util.concurrent.ExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableInterface implements Callable {

    public Object call() throws Exception {

        System.out.println("Callable Method is executed");

        return "Hello";
    }

    public static void main(String[] args) {

        ExecutorService exe = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            Future sub = exe.submit(new CallableInterface());

            try {
                Thread.sleep(200);
                System.out.println(sub.get().toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
