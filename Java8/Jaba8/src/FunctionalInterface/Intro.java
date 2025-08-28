package FunctionalInterface;

import java.util.function.Predicate;

//Without lambda expression
public class Intro implements Predicate<Integer> {
    public static void main(String[] args) {
        Intro i = new Intro();
        System.out.println(i.test(100));

    }
    @Override
    public boolean test(Integer integer) {

        return 100 > 50;
    }
}
