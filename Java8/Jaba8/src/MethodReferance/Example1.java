package MethodReferance;

@FunctionalInterface
interface ReferanceInterface {
    void hi();
}

@FunctionalInterface
interface ReferanceInter {
    void sound();
}

public class Example1 {

    public static void methodN() {
        System.out.println("I am static method ----->> I am Referanced Method");
    }

    public void methodN2() {
        System.out.println("I am non-static method ----->> I am Referanced Method");

    }

    public static void main(String[] args) {

        //Static Method Referance
        ReferanceInterface ref = Example1::methodN;
        ref.hi();

         //Static Method Referance
        System.out.println("=========================================");
        Example1 sc = new Example1();
        ReferanceInter ref2 = sc::methodN2;
        ref2.sound();

    }
}
