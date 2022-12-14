package date_time;

import java.sql.SQLOutput;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DurationAndPeriod {

    public static void main(String[] args) {
        /*
        How many days passed since you were born
        currentDate- dateofBirth

        How many years passed
        Ho many months passed
        How many weeks passed
        How many days passes
         */

        LocalDate today = LocalDate.now();
        LocalDate dateOfBirth = LocalDate.of(1990, 2, 14);

        System.out.println(today);
        System.out.println(dateOfBirth);

        System.out.println(Period.between(dateOfBirth, today).getYears());
        System.out.println(Period.between(dateOfBirth, today).getMonths());
        System.out.println(Period.between(dateOfBirth, today).getDays());

        //Using ChronoUnit

        System.out.println( ChronoUnit.YEARS.between(dateOfBirth, today));
        System.out.println(ChronoUnit.MONTHS.between(dateOfBirth, today));
        System.out.println(ChronoUnit.WEEKS.between(dateOfBirth, today));
        System.out.println(ChronoUnit.DAYS.between(dateOfBirth, today));

        LocalTime localTime1 = LocalTime.of(12,44,15);
        LocalTime localTime2= LocalTime.of(13, 45, 45);

        System.out.println(Duration.between(localTime1, localTime1).getSeconds());

        //ChronoUnit

        System.out.println(ChronoUnit.HOURS.between(localTime1, localTime2));
        System.out.println(ChronoUnit.MINUTES.between(localTime1, localTime2));
        System.out.println(ChronoUnit.SECONDS.between(localTime1, localTime2));



    }
}
