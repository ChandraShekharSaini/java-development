package Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamMethod {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("Hilio");
        list.add("Hore");
        list.add("World");
        list.add("Java");
        list.add("Stream");
        list.add("C++");

        Stream<String> stream =  list.stream().filter(st -> st.startsWith("H"));

        stream.forEach((i)-> System.out.println(i));


    }
}
