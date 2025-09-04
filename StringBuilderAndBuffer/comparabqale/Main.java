
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Comparable12 sc1 = new Comparable12("Chandra", 45, "roorkee");
        Comparable12 sc2 = new Comparable12("Ram", 167, "chennai");
        Comparable12 sc3 = new Comparable12("Ramdev", 23, "jaipur");
        Comparable12 sc4 = new Comparable12("Chetan", 23, "bengaluru");
        Comparable12 sc5 = new Comparable12("Babu", 15, "pune");
        Comparable12 sc6 = new Comparable12("Ayush", 145, "shrinagar");
        Comparable12 sc7 = new Comparable12("Modi", 23, "saharanpur");

      

        List<Comparable12> list = new ArrayList(Arrays.asList(sc1 , sc2 , sc3, sc4, sc5, sc6,sc7));

        Object[] arr = list.toArray();

        for(Object x : arr){
            System.err.println(x);
        }

         
list.stream()
    .sorted((s1, s2) -> s1.getAge().compareTo(s2.getAge()))
    .forEach(x -> System.out.println(x.getName() + " " + x.getAge() + " " + x.getAddress()));




    int n = sc.next();
    if(n<2){
        System.out.println("false");
        return;
    }

    int cnt = 0;
    for (int i = 2;  i*i <=n; i++) {
       
        if(n%i==0){
            i++;
        }
        
    }




    }
}
