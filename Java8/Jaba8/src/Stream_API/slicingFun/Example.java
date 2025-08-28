package Stream_API.slicingFun;

import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(22);
        list.add(31);
        list.add(12);
        list.add(100);
        list.add(21);
        list.add(40);
        list.add(42);

        list.stream().skip(2).forEach((num) -> System.out.println(num));
        System.out.println("============================================");
        list.stream().limit(4).forEach((num) -> System.out.println(num));
        System.out.println("============================================");
        list.stream().distinct().limit(6).skip(3).forEach((num) -> System.out.println(num));


    }
}
