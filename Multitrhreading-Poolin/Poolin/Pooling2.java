package Poolin;

import java.util.concurrent.*;



public class Pooling2 implements Callable {



    @Override
    public Double call() throws Exception {
        System.out.println("Heavy task started.....");
        Double resut = Math.pow(12,3);
        return  resut;


    }


    public static <ExecutorSevice> void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future futhure = executor.submit(new Pooling2());

        System.out.println("Heavy Result "+  futhure.get());




        executor.shutdown();


    }
}
