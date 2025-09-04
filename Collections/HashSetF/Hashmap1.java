
import java.util.HashMap;

public class Hashmap1{

    public static void main(String[] ags){

      HashMap<Integer , Integer> map = new HashMap<>();

      map.put(12 , 0);
      map.put(12 , 90);
      map.put(13,1);
      map.put(14,2);
      map.put(15  , 3);
      map.put(16 , 4);

      System.out.println(map);

      System.out.println(map.get(12));

      System.out.println(map.containsKey(16));

      System.out.println(map.containsValue(16));
      
      System.out.println(map.size());

      System.out.println(map.remove(16));

      System.out.println(map);

      map.clear();

      System.out.println(map);

      System.out.println(map.isEmpty());


    }
}