package Stream_API.Distinct;

import java.util.List;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Chandra", "Shekhar", "Saini", "Chandra", "Manu", "Manu", "Pallalvi");
        List<String> distincList = list.stream().distinct().collect(Collectors.toList());
        distincList.forEach((name)->System.out.println(name));

    }
}
