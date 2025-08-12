import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ConcurrentPakage {

    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(4);

        // Submit tasks to the thread pool
        for (int i = 0; i < 10; i++) {
            executor.submit(new MyTask("Task " + i));

            executor.execute(new MyTask("Task " + i));
        }

        // Shutdown the executor after task completion
        executor.shutdown();
    }

}

class MyTask implements Runnable {

    private String name;

    public MyTask(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " is running on " + Thread.currentThread().getName());

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
