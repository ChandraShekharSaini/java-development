package FunctionalInterface;

import java.util.function.Predicate;

public interface Example {

    static Predicate<Integer> result1 = (x) -> x % 2 == 0;

    public static void main(String[] args) {

        Predicate<Integer> result2 = (Integer y) -> y % 2 == 0;
        Predicate<String> result3 = (m) -> m.length() > 10;


        System.out.println(result1.test(10));
        System.out.println(result2.test(11));
        System.out.println(result3.test("Chandra Shekhar Saini"));
    }

}
