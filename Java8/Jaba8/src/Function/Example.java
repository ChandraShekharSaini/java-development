package Function;

import java.util.function.Function;

public class Example {
    public static void main(String[] args) {

        Function<Integer, String> sc = (num) -> {
            return "I am no:" + num;
        };

        String ans = sc.apply(10);
        System.out.println(ans);


        System.out.println("======================andThen()===============================");
        Function<Integer, Integer> sc1 = (x) -> {
            return x + 2;
        };
        Function<Integer, Integer> sc2 = (x) -> x + 3;
        System.out.println(sc1.andThen(sc2).apply(10));

        System.out.println("======================compose()===============================");

        Function<Integer, Integer> sc3 = (x) -> {
            return x + 2;
        };
        Function<Integer, Integer> sc4 = (x) -> x * 3;


        System.out.println(sc3.compose(sc4).apply(10));

        System.out.println("======================identiy()===============================");
        Function<Integer, Integer> c = Function.identity();
        System.out.println(c.apply(12));
    }


}
