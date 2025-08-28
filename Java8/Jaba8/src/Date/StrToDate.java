package Date;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//Convert String to Date
// //Convert String to Date
public class StrToDate {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date d = sdf.parse("02/13/2025");

            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
