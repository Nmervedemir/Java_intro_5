package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class CurrentDate {
    public static void main(String[] args) {


        System.out.println("\n---------------Date class--------------\n");
        Date date = new Date();
        System.out.println(date); // Sun Dec 11 12:16:26 EST 2022

        System.out.println("\n---------------LocalDate class--------------\n");

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); //2022-12-11


        System.out.println( localDate.plusDays(7));//2022-12-18
        System.out.println(localDate.getMonth());// DECEMBER
        System.out.println(localDate.getMonthValue()); //12
        System.out.println(localDate.getDayOfWeek()); //SUNDAY
        System.out.println(localDate.getDayOfWeek()); //11
        System.out.println(localDate.getDayOfYear()); //345

        System.out.println("\n---------------LocalTime class--------------\n");

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime); //12:19:00.78
        System.out.println(localTime.minus(2,ChronoUnit.HOURS));


        System.out.println("\n---------------LocalDateTime class--------------\n");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime); //2022-12-11T12:24:15.954

    }
}
