import java.util.Comparator;

public class durationComparater implements Comparator<Fligt> {

     @Override
    public int compare(Fligt o1, Fligt o2) {
        return o1.getDuration().compareTo(o2.getDuration());
    }
}
