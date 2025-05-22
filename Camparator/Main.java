import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Fligt f1 = new Fligt("Indigo", 1000, 1.5, "10.30");
        Fligt f2 = new Fligt("Aair India", 4500, 1.5, "11.30");
        Fligt f3 = new Fligt("Abair America", 1100, 1.5, "12.00");
        Fligt f4 = new Fligt("Emirates", 5400, 1.5, "1.30");
        Fligt f5 = new Fligt("Data", 2100, 1.5, "7.30");
        Fligt f6 = new Fligt("Bata Airline", 2100, 1.5, "4.30");
        Fligt f7 = new Fligt("Australian", 1100, 1.5, "12.00");

        // System.out.println(f1);
        // System.out.println(f2);
        // System.out.println(f3);
        // System.out.println(f4);
        // System.out.println(f5);
        // System.out.println(f6);
        // System.out.println(f7);

        // ArrayList<Fligt> list = new ArrayList<>();
        // list.add(f1);
        // list.add(f2);
        // list.add(f3);
        // list.add(f4);
        // list.add(f5);

        // System.out.println(list);

        TreeSet<Fligt> list = new TreeSet<>();
        list.add(f1);
        list.add(f2);
        list.add(f3);
        list.add(f4);
        list.add(f5);
        list.add(f6);
        list.add(f7);

        // System.out.println(list);

        // TreeSet list = new TreeSet<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

         System.out.println(list);

    }
}
