package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

//Convert DATE to String  //Convert DATE to String
public class ConDateStr {
    public static void main(String[] args) {

        Date d = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String  date =  sdf.format(d);
        System.out.println(date);

    }
}
