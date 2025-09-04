import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;

public class MainEmp {
    public static void main(String[] args) {

        Employe e1 = new Employe(0, "Chandra", "HR", 50000);
        Employe e2 = new Employe(1, "Rahul", "Software Enginering", 12900);
        Employe e3 = new Employe(2, "Madav", "Marketing", 178000);
        Employe e4 = new Employe(3, "Ariant", "Finance", 82000);
        Employe e5 = new Employe(4, "Babu", "Testing", 61000);
        Employe e6 = new Employe(0, "Chandra", "HR", 50000);
        Employe e7 = new Employe(3, "Ariant", "Finance", 82000);
        Employe e8 = new Employe(4, "Babu", "Testing", 61000);
        Employe e9 = new Employe(6, "Pallavi", "Education", 77000);
        Employe e10 = new Employe(7, "Bablu", "IT", 77000);
        Employe e11 = new Employe(8, "Rajat Singh", "Education", 77000);

        List<Employe> list = Arrays.asList(e1, e2, e3, e4, e5);

        System.out.println(list);

        System.out.println("===============filter()=============================");

        list.stream().filter((obj) -> obj.getName().startsWith("M"))
                .forEach((x) -> System.out.println(x.getName() + " " + x.getDepartment()));

        System.out.println("===============map()=============================");

        list.stream().map((obj) -> obj.getName().toUpperCase()).forEach((i) -> System.err.println(i));

        System.out.println("===============distint()=============================");

        List<Employe> list3 = list.stream().distinct().collect(Collectors.toList());

        System.out.println(list3);

        System.out.println("===sort() Comparator.comparingInt((obj)->obj.getName().length()))==============");

        list.stream().sorted(Comparator.comparingInt((obj) -> obj.getName().length())).forEach(System.out::println);

        System.out.println("===sort() (e1, e2)->e1.getName().compareTo(e2.getName())==============");

        list.stream().sorted((o1, o2) -> o2.getName().compareTo(o1.getName())).forEach(System.out::println);
 


        System.out.println("===findAny() ==============");

        boolean flag = list.stream().anyMatch((obj) -> obj.getId() == 1);
        System.out.println(flag);

        System.out.println("===addFirst()]=============");

        Optional<Employe> str = list.stream().findFirst();

        if (str.isPresent()) {
            System.out.println(str.get());
        } else {
            System.out.println(str.get());
        }

        System.out.println("===limit=============");

        list.stream().distinct().skip(2).limit(4).forEach(System.out::println);


        Arrays.asList(a)
    }
}
