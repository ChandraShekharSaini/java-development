package Poolin;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class Pooling implements  Runnable {

    private String name;
    private ExecutorService pool;

    @Override
    public void run() {

        String name = Thread.currentThread().getName();

             System.out.println("Task is executed by" + name);

            try{
                Thread.sleep(2000);
                System.out.println("Task is executed by" + name);


            }catch (Exception e){
                e.printStackTrace(System.err);
            }


    }

    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(6);

        for (int i = 1; i <=10; i++) {
            pool.execute(new Pooling());
        }

        pool.shutdown();

    }
}
