package CollectonsPractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeExample {                   //for time use time instead of date

    public static void main(String[] args) {
        LocalDate date= LocalDate.now();
        LocalDate yesterday= date.minusDays(1);
        LocalDate tomorrow= date.plusDays(1);
        System.out.println(date);
        System.out.println(yesterday);
        System.out.println(tomorrow);

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String format = dateTime.format(formatter);



    }

}
