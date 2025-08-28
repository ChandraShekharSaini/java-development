package Stream_API.Mappinunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Addfirst {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("JavaScipt");
        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("C#");
        list.add("Java");

    Optional<String> sc = list.stream().findFirst();

    if (sc.isPresent()) {
        System.out.println(sc.get());
    }
    else{
        System.out.println("Not found");
    }


    }
}
