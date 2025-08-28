package Stream_API.Mapfilter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] args) {

        List<Employ> list = new ArrayList<Employ>();

        list.add(new Employ(1, "Chandra", "Bengaluru", 45));
        list.add(new Employ(2, "James", "Jaipur", 15));
        list.add(new Employ(3, "Mary", "Chennai", 44));
        list.add(new Employ(4, "Pallvi", "Mumbai", 34));
        list.add(new Employ(5, "John Doe", "Pune", 23));
        list.add(new Employ(6, "Shekhar", "Noida", 78));
        list.add(new Employ(7, "Raju", "Gurugram", 44));
        list.add(new Employ(8, "Ayushi", "Indore", 12));
        list.add(new Employ(9, "Chetan", "Indore", 31));

        System.out.println("=============Age Greater than 30 start====================");
        Stream<Employ> myData = list.stream().filter((obj) -> obj.getAge() > 30);
        myData.forEach((i) -> System.out.println(i));
        System.out.println("=============Age Greater than 30 end======================");

        System.out.println("=============Name start with C start====================");
        list.stream().filter((obj) -> obj.getName().startsWith("C")).forEach(System.out::println);
        System.out.println("=============Name start with C start end==================");

        System.out.println("=============Obj age>44 and name with C start====================");
        Stream<Employ> myData2 = list.stream().filter((obj) -> obj.getAge() > 44 && obj.getName().startsWith("C"));
        myData2.forEach((i) -> System.out.println(i));
        System.out.println("=============Obj age> 44 and name with C end====================");


        System.out.println("=============Obj mapping=======================================");
        list.stream().map(employ -> employ.getName() + " Lenght of name: " + employ.getName().length()).forEach(System.out::println);

        list.stream().map(employ -> employ.getName().toUpperCase()).forEach(System.out::println);

        System.out.println("=============Obj map to int====================================");
        List<Integer> myData3 = list.stream().mapToInt(employ -> employ.getName().length()).boxed().collect(Collectors.toList());

        myData3.forEach((i) -> System.out.println(i));


    }
}

