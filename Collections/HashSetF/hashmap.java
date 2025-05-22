import java.util.HashSet;

public class hashmap {
    public static void main(String[] args) {

        HashSet<Integer> sc = new HashSet<>();

        sc.add(12);
        sc.add(13);
        sc.add(12);
        sc.add(14);
        sc.add(15);
        sc.add(16);

        System.out.println(sc);

        System.out.println("-------------");
        System.out.println(sc.isEmpty());

        System.out.println("-------------");
        System.out.println(sc.size());

        System.out.println("-----------------");
        System.out.println(sc.contains(8));

        System.out.println("-----------------");
        HashSet<String> set1 = new HashSet<>();
        set1.add("Java");
        set1.add("Python");
        set1.add("C++");
        set1.add(".Net");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Java");
        set2.add("C");
        set2.add(".Net");
        set2.retainAll(set1);

        System.out.println(set2);

        System.out.println("-----------------");
        HashSet<String> set3 = new HashSet<>();
        set3.add("Java");
        set3.add("Python");
        set3.add("C++");
        set3.add("JavaScript");
        set3.add("C#");

        HashSet<String> set4 = new HashSet<>();
        set4.add("Python");
        set4.add("C++");

        set3.removeAll(set4);
        System.out.println(set3);

        System.out.println("-----------------");
      

       

    }
}
