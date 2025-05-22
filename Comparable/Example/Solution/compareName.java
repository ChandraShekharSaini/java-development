
import java.util.Comparator;

class compareName implements Comparator<Employe> {

    public int compare(Employe o1, Employe o2) {
        return o1.getName().compareTo(o2.getName());
    }

}