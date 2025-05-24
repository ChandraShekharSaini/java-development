
import java.util.ArrayList;
import java.util.Collections;

public class Sample {
    public static void main(String[] args) {

        Employe e1 = new Employe("Chandra", 19);
        Employe e2 = new Employe("Shekhar", 13);
        Employe e3 = new Employe("Rahul", 11);
        Employe e4 = new Employe("Ayush", 17);
        Employe e5 = new Employe("Kumar", 20);

        ArrayList<Employe> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        // bec we have not use Comparable or Comparable interface in our Employe
        // class giving compile time error

        Collections.sort(list);

        for (Employe x : list) {
            System.out.println(x);
        }

    }
}
