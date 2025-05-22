import java.util.Iterator;
import java.util.PriorityQueue;

public class PrioritQueue {
    public static void main(String[] chandra) {

        PriorityQueue<String> sc = new PriorityQueue();

        // sc.add(10);
        // sc.add(20);
        // sc.add(30);
        // sc.add(40);
        // sc.add(10);
        // sc.add(10);
        // sc.add(40);
        // sc.add(11);

        sc.add("Chandra");
        sc.add("Shekhar");
        sc.add("Tami");
        sc.add("Ramu");
        sc.add("Chandra");
        sc.add("Chandra");
        sc.add("Ramu");

        System.out.println(sc);

        Iterator<String> it = sc.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("----------------------");
        System.out.println(sc.element());
        System.out.println(sc.element());

        System.out.println("----------------------");
        System.out.println(sc.peek());
        System.out.println(sc);

        System.out.println("----------------------");
        System.out.println(sc.poll());
        System.out.println(sc);

        // System.out.println("----------------------");
        // System.out.println(sc.removeAll(sc));
        // System.out.println(sc);

        System.out.println("----------------------");
        System.out.println(sc.remove());
        System.out.println(sc);

        System.out.println("----------------------");
        System.out.println(sc.contains("Chandra"));
        System.out.println(sc);

        System.out.println("----------------------");
        PriorityQueue<String> sc1 = new PriorityQueue<>();

        sc1.add("Tami");
        sc1.add("Ramu");
        sc1.add("Chandra");
        System.out.println(sc.containsAll(sc1));
        System.out.println(sc);

        System.out.println("----------------------");
        Object[] arr = sc.toArray();

        for (Object x : arr) {
            System.out.println(x);
        }
    }
}