import java.util.Comparator;

public class nameComparator implements Comparator<Fligt> {

     @Override
    public int compare(Fligt o1, Fligt o2) {
        return o1.getname().compareTo(o2.getname());
    }
}
