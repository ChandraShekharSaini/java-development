package Date;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeFF {

    public static void main(String[] args) {

        //HH:mm:ss.SSSSSSSSS (hours:minutes:seconds:nanoseconds).

        LocalTime lt = LocalTime.now();

        System.out.println(lt);
        System.out.println("Get Hour: " + lt.getHour());
        System.out.println("Get Minute: " + lt.getMinute());
        System.out.println("Get Secound: " + lt.getSecond());
        System.out.println("Get NanoTime:" + lt.getNano());

        System.out.println("======================================================");

        System.out.println("Get Hour with added specific value" + lt.plusHours(1));
        System.out.println("Get Minute with added specific value" + lt.plusMinutes(1));
        System.out.println("Get Secound with added specific value" + lt.plusSeconds(1));
        System.out.println("Get NanoTime with added specific value" + lt.plusNanos(1));

        System.out.println("======================================================");

        LocalDate lt2c = LocalDate.now();
        System.out.println(lt2c);
       System.out.println( lt2c.plusDays(4));


    }
}
