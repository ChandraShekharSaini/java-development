package Stream_API;

import java.util.ArrayList;
import java.util.stream.Stream;

//Stream Method
public class StreamOf {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        System.out.println(stream);

        Integer num[] = {12, 34, 4, 5, 5};

        Stream<Integer> stream2 = Stream.of(num);

        System.out.println(stream2);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.stream();
        System.out.println(list);

    }
}
