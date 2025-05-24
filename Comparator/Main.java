import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Fligt f1 = new Fligt("Air India", 1200, 1.5, "India");
        Fligt f2 = new Fligt("Turkey Airlines", 1600, 1.9, "Turkey");
        Fligt f3 = new Fligt("Emirates Airlines", 5400, 3.5, "UAE");
        Fligt f4 = new Fligt("Jumbo Jet", 88200, 1.5, "America");
        Fligt f5 = new Fligt("Singapore Airlines", 8900, 4.6, "Rand");
        Fligt f6 = new Fligt("Pakistan Airlines", 6600, 2.5, "Pak");

        ArrayList<Fligt> sc = new ArrayList<>();
        sc.add(f1);
        sc.add(f2);
        sc.add(f3);
        sc.add(f4);
        sc.add(f5);
        sc.add(f6);

        System.out.println(sc);

        // Collections.sort(sc, new nameComparator());

        // Collections.sort(sc, new depatmentComparator());

        Collections.sort(sc, new durationComparater());

        Collections.sort(sc);

        for (Fligt x : sc) {
            System.out.println(x);
        }

    }
}
