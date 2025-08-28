package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Exampl3Main {

    public static void main(String[] args) {

        List<Exampl3> list = new ArrayList<>();

        list.add(new Exampl3(1, "Chandra", "chandrashw@gmail.com", 25));
        list.add(new Exampl3(2, "Shekhar", "shekha@gmail.com", 26));
        list.add(new Exampl3(3, "Rahul", "rahul@gmail.com", 27));
        list.add(new Exampl3(4, "Ayush", "ayusg@gmail.com", 48));
        list.add(new Exampl3(5, "Saini", "saini@gmail.com", 59));
        list.add(new Exampl3(6, "parul", "parul@gmail.com", 30));


        System.out.println("=====================Without Lambda Expression=====================");
//        for (Exampl3 x : list) {
//            if (x.getAge() > 40) {
//                System.out.println(x.getName() + " is eligible for voting");
//            } else {
//                System.out.println(x.getName() + " is not eligible for voting");
//            }
//        }


        System.out.println("=====================With Lambda Expresion=====================");

        Predicate<Integer> sc = (Integer age) -> age > 40;

        for (Exampl3 e : list) {
            if (sc.test(e.getAge())) {
                System.out.println(e.getName() + " is eligible for voting");
            } else {
                System.out.println(e.getName() + " is not eligible for voting");
            }
        }


    }


}
