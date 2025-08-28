package Stream_API.Mappinunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12, 45, 23, 78, 45, 66);

        // Returns true if any element matches the condition.
        boolean result1 = list.stream().anyMatch(num -> num % 4 == 0);
        System.out.println(result1); //true

        // Returns true if all elements match the condition.
        boolean result2 = list.stream().allMatch(num -> num % 4 == 0);
        System.out.println(result2); //false

        // Returns true if no element matches the condition.
        boolean result3 = list.stream().noneMatch(num -> num % 4 == 0);
        System.out.println(result3); //false

    }
}
