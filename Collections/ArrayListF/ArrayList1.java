import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList1 {

    public static void main(String[] args) {

        ArrayList<Integer> sc = new ArrayList<>();

        sc.add(12);
        sc.add(14);
        sc.add(15);

        // sc.clear();

        System.out.println(sc);

        System.out.println(sc.get(0));

        // System.out.println(sc.getFirst());
        // System.out.println(sc.getLast());

        System.out.println("Remove Element:" + sc.remove(0));

        // System.out.println(sc.remove());

        Object[] arr1 = sc.toArray();
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println(sc.size());

        System.out.println(sc.isEmpty());

        System.out.println(sc.contains(14));

        sc.add(101);
        sc.add(102);
        sc.add(103);

        System.out.println("--------------------------------");
        ListIterator<Integer> i = sc.listIterator(4);
        System.out.println(sc);
        System.out.println("Iterating through the list:");
        while (i.hasPrevious()) {
            System.out.print(i.previous() + " ");
        }
        System.out.println("-----------------------------");
        ArrayList<Integer> sc1 = new ArrayList<Integer>();
        sc1.add(101);
        sc1.add(102);
        sc1.add(103);
        sc1.add(104);
        sc1.add(105);
        System.out.println(sc1);

        System.out.println(sc1.get(2));
        System.out.println(sc1.contains(101));
        // System.out.println(sc1.add(1,23));

        System.out.println(sc1.indexOf(101));
        System.out.println(sc1);
        System.out.println(sc1.remove(2));

        System.out.println(sc1);
    }

}
