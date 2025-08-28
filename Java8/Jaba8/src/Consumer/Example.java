package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Example {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Consumer<String> sc = (name) -> {
            System.out.println(name);
        };

        sc.accept("ChandraShekharSaini");

        System.out.println("===========================================");

        Consumer<String> sc1 = (name1) -> {
            System.out.println(name1);
        };

        Consumer<String> sc2 = (name2) -> {
            System.out.println(name2);
        };

        Consumer<String> sc3 = sc1.andThen(sc2);
          sc3.accept("Chandra Shekhar Saini");
    }
}
