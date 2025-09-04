
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
      
        //1. Method
        Integer[] arr = { 12, 34, 4, 6, 66 };
        List<Integer> list = Arrays.asList(arr);
        System.out.println(list);

        //but we can not add new element in this list


        // 2. Method
        Integer[] arr1 = { 12, 34, 4, 6, 66 };
        ArrayList<Integer> sc = new ArrayList();
        Collections.addAll(sc, arr1);
        System.out.println(sc);


    }
}
