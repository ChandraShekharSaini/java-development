import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Priorit {
    public static void main(String[] ags) {

        PriorityQueue<Integer> queue = new PriorityQueue();

        queue.add(12);
        queue.add(13);
        queue.add(6);
        queue.add(10);
        queue.add(20);


        // queue.form(12);

        System.out.println(queue);
        Iterator<Integer> it = queue.iterator();

        while (it.hasNext()) {
            System.err.println(it.next());
        }

        System.out.println(queue.poll());

        System.out.println(queue);
        System.out.println(queue.peek());

        System.out.println(queue);

        System.out.println(queue.remove());
        System.out.println(queue.remove());

        System.out.println(queue);

        System.out.println(queue.contains("20"));

        PriorityQueue<Integer> queue2 = new PriorityQueue<>();
        queue2.add(12);
        queue2.add(13);
        queue2.add(67);

        System.out.println(queue.contains(queue));

        System.out.println("Conveing Ino Array");

        Object[] arrr = queue2.toArray();

        for (Object x : arrr) {
            System.out.println(x);
        }

    }
}