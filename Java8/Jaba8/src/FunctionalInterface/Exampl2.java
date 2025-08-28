
package FunctionalInterface;

import java.util.function.Predicate;

public class Exampl2 {
    public static void main(String[] args) {
        String names[] = {"Chandra", "Shekhar", "Rahul", "Ayush",};

        Predicate<String> flag = y -> y.charAt(0) == 'C';

        for (String name : names) {
            if (flag.test(name)) {
                System.out.println(name + " starts with C");
            } else {
                System.out.println(name + " does not start with C");
            }
        }
    }
}
