import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Hashmap {

                            


    public static void main(String[] args) {
        HashMap<String, String> sc = new HashMap<>();

        sc.put("FirstName", "Shekhar");
        sc.put("LastName", "Saini");
        sc.put("Age", "22");
        sc.put("City", "Roorkee");
        sc.put("State", "Roorkee");

        System.out.println(sc);

        HashMap<Integer, Integer> sc1 = new HashMap<>();
        sc1.put(123, 1);
        sc1.put(123, 101);
        sc1.put(124, 2);
        sc1.put(125, 3);
        sc1.put(126, null);
        sc1.put(null, null);

        System.out.println(sc1);
        System.out.println(sc1.size());

        System.out.println("------------------");
        System.out.println(sc1.entrySet());

        System.out.println("-------------------");
        Set<Entry<Integer, Integer>> entry = sc1.entrySet();

        for (Entry<Integer, Integer> x : entry) {
            System.out.println(x);
        }

        System.out.println("-------------------");

        Set<Integer> key = sc1.keySet();

        System.out.println(key);

        System.out.println("---------Collections-values----------");
        Collection<Integer> value = sc1.values();
        System.out.println(value);
        for (Integer val : value) {
            System.out.print(val + " ");
        }

        System.out.println("---------Collections-values----------");
        Collection<Integer> valueKey = sc1.keySet();
        System.out.println(valueKey);

        System.out.println("----------Contains-key-----------");
        System.out.println(sc1.containsKey(123));

        System.out.println("----------Contains-value-----------");
        System.out.println(sc1.containsValue(3));

        System.out.println("------------get()----------------");
        System.out.println(sc1.get(null));

        System.out.println("------------firstEntry()----------------");

        // getOrDefault();
        // pollFistEntry();
        // pollLastEntry();

        sc1.remove(126);
        System.out.println(sc1);

        System.out.println("----------------------------");
        System.out.println(sc1.remove(null,null));
        System.out.println(sc1);


    }
}