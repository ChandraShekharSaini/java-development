package MethodReferance.Runnable;

import MethodReferance.Example1;

public class Example2 implements Runnable {

    public void run() {
        System.out.println("I am running");
    }

    public static void main(String[] args) {

        Example2 sc = new Example2();
        Runnable r = sc::run;

        Thread t = new Thread(r);
        t.start();
    }
}
