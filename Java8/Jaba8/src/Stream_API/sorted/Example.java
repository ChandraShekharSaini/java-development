package Stream_API.sorted;

import java.util.Arrays;
import java.util.Comparator;


public class Example {

    public static void main(String[] args) {

        //natural ordering (Comparable)
        Integer[] arr = {12, 34, 5, 6, 12, 34, 55, 45, 66};
        Arrays.stream(arr).sorted().forEach((num) -> System.out.println(num));

        String [] names = {"Chandra" , "Ayushi" , "Shekhar","Rahul" , "Pallvi"};
       Arrays.stream(names).sorted().forEach((name) -> System.out.println(name));

        // custom comparator
        Arrays.stream(names).sorted(Comparator.comparingInt((s)->s.length())).forEach((i)->System.out.println(i));

    }
}
