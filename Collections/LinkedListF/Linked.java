import java.util.Iterator;
import java.util.ListIterator;

import javafx.scene.effect.Light.Spot;

import java.util.LinkedList;

public class Linked {

  public static void main(String[] args) {
    LinkedList<Integer> sc = new LinkedList<>();

    sc.add(89);
    sc.add(55);
    sc.add(56);
    sc.addLast(88);
    sc.add(344);
    sc.add(311);

    System.out.println(sc);

    sc.addFirst(101);
    sc.addLast(102);
    System.out.println(sc);

    System.out.println(sc.remove());
    System.out.println("LinkedList: " + sc);
    System.out.println(sc.removeFirst());
    System.out.println("LinkedList: " + sc);
    System.out.println(sc.removeLast());
    System.out.println("LinkedList: " + sc);
    System.out.println(sc.get(1));
    System.out.println("LinkedList: " + sc);
    System.out.println(sc.peek());

    System.out.println(sc.poll());

    System.out.println(sc.contains(311));

    System.out.println(sc.isEmpty());

    LinkedList<Integer> sc1 = new LinkedList<>();
    sc1.add(101);
    sc1.add(102);
    sc1.add(103);
    sc1.add(104);
    sc1.add(105);

    Integer[] arr = new Integer[sc1.size()];

    sc1.toArray(arr);

    for (Integer x : arr) {
      System.out.println(x);
    }

    System.out.println("-------------------------");
    LinkedList<Integer> list = new LinkedList<>();

    list.add(123);
    list.add(124);
    list.add(123);
    list.add(125);
    list.add(126);

    System.out.println(list);
    System.out.println(list.peekFirst());
    System.out.println(list.peekLast());
    System.out.println(list);

    System.out.println("-------------------------");

    System.out.println(list);
    System.out.println(list.pollFirst());
    System.out.println(list.pollLast());
    System.out.println(list);

    System.out.println("---------------Iterator------------------");
    LinkedList<Integer> list1 = new LinkedList<>();

    list1.add(101);
    list1.add(102);
    list1.add(103);
    list1.add(104);
    list1.add(105);
    list1.add(106);
    list1.add(107);

    Iterator<Integer> it = list1.iterator();

    while (it.hasNext()) {
      System.out.print(it.next() + " ");
    }

    System.out.println("----------------Listiterator--------------------------");
    LinkedList<String> list2 = new LinkedList<>();
    list2.add("Chandra");
    list2.add("Yadav");
    list2.add("Kumar");
    list2.add("Pagal");
    list2.add("Baba");

    ListIterator lit = list2.listIterator();

    while (lit.hasNext()) {
      System.out.println(lit.next());
    }

    System.out.println("----------------Listiterator-Reverse------------------");
    while (lit.hasPrevious()) {
      System.out.println(lit.previous());
    }

  }
}