import java.lang.reflect.Executable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList3 {
    public static void main(String[] args) {

        ArrayList sc = new ArrayList();
        sc.add(12);
        sc.add(17);
        sc.add("scd");
        sc.add(true);
        sc.add(12.45);
        sc.add("Shekhar");

        sc.set(1, 101);

        System.out.println(sc);

        System.out.println(sc.contains(12.45));

        // Check if "Chandra" is Present
        if (sc.contains("Chandra")) {
            System.out.println("I am Present");
        } else {
            System.out.println("I am not Present");
        }

        ArrayList sc2 = new ArrayList();

        sc2.add(12);
        sc2.add(14);
        sc2.add(15);
        sc2.add(16);
        sc2.add(17);

        System.out.println(sc2);

        System.out.println("-----------------addAll()--------------");
        System.out.println("List 1:" + sc);
        System.out.println("List 2:" + sc2);
        sc2.addAll(sc);
        System.out.println("List 2:" + sc2);

        System.out.println("-------------------addAll()---------------");
        ArrayList sc3 = new ArrayList();
        sc3.add(123);
        sc3.add(124);

        sc.addAll(2, sc3);

        System.out.println("List 3 added to List 1 index1:" + sc);

        System.out.println("----------retainAll()---------------------");

        ArrayList sc4 = new ArrayList();
        sc4.add(1);
        sc4.add(2);
        sc4.add(3);
        sc4.add(4);
        sc4.add(5);
        sc4.add(90);
        ArrayList sc5 = new ArrayList();
        sc5.add(1);
        sc5.add(2);
        sc5.add(5);
        sc5.add(6);
        sc5.add(966);

        System.out.println("List 4 Before Reataining Duplicate" + sc4);
        System.out.println(sc4.retainAll(sc5));
        System.out.println("List 4 After Reataining Duplicate" + sc4);

        System.out.println("------------only-keep--duplicate--removeAll()-----------");

        sc4.removeAll(sc5);
        System.out.println(sc4);

        System.out.println("--------------containsAll()----------------------------");

        System.out.println(sc4.containsAll(sc5));

        System.out.println("-------------subList()--------------");
        ArrayList<Integer> sc6 = new ArrayList();

        sc6.add(900);
        sc6.add(1001);
        sc6.add(1002);
        sc6.add(1003);
        sc6.add(1004);
        sc6.add(1005);
        sc6.add(1006);
        sc6.add(1007);

        System.out.println(sc6.subList(2, 6));
        int i = 0;
        for (; i < sc6.size();) {
            System.out.println(sc6.get(i));
            i++;
        }
        System.out.println("---------------forEachLoop------------------");
        for (Integer x : sc6) {
            System.out.println(x);
        }

        System.out.println("-----------Iteration--using---Iterator------------");

        Iterator<Integer> it = sc6.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.getMessage();
                e.printStackTrace();
            }
        }

        System.out.println("-----------Iteration--using---ListIterator------------");
        System.out.println("--------Can Iterate-in-Forward-and-Backward-Direction----");

        ListIterator lit = sc6.listIterator(sc6.size());

        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.getMessage();
                e.printStackTrace();
            }
        }

        System.out.println("----------sublist()---------------");
        List<Integer> sl = sc6.subList(2, 6);
        for (Integer x : sl) {
            System.out.println(x);
        }

    }
}
