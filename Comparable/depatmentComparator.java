import java.util.Comparator;

public class depatmentComparator implements Comparator<Fligt> { 
    
    @Override
    public int compare(Fligt o1, Fligt o2) {
        return o1.getDepatment().compareTo(o2.getDepatment());
    }
}
