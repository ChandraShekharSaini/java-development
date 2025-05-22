import java.util.SortedSet;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {

        TreeSet<Integer> sc = new TreeSet<>();

        sc.add(5);
        sc.add(14);
        sc.add(15);
        sc.add(12);
        sc.add(13);
        sc.add(13);
        sc.add(13);
        sc.add(21);
        sc.add(20);
        sc.add(25);

        System.out.println(sc);

        System.out.println(sc.first());
        System.out.println(sc.last());

        System.out.println(sc.lower(20));
        System.out.println(sc.higher(20));
        System.out.println("------------------------");
        System.out.println(sc.ceiling(0));

        System.out.println("------------------------");
        System.out.println(sc.ceiling(20));

        System.out.println(sc.floor(16));
        System.out.println(sc.floor(-1));

        SortedSet<Integer> s = sc.headSet(20, true);
        System.out.println(s);

        SortedSet<Integer> s1 = sc.subSet(5,false,20, true);
        System.out.println(s1);
    }
}