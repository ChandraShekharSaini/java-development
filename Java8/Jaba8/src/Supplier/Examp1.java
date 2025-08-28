package Supplier;

import java.util.function.Supplier;

public class Examp1 {
    public static void main(String[] args) {

        Supplier<String> sc1 = () -> "I am Good";
        System.out.println(sc1.get());


        Supplier<Double> sc2 = () -> {
            double otp = Math.floor(Math.random() * 1000);
            return otp;
        };

        System.out.println(sc2.get());
    }
}
