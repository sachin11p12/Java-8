package New_Date_time_classes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Basics {
    public static void main(String[] args) {
//        The legacy Date and Calendar classes had several design issues, such as mutability, confusing APIs,
//        zero-based months in Calendar, and poor date/time-zone handling. They were also difficult to work with and prone to errors.
//        To overcome these limitations, Java 8 introduced the java.time Date and Time API, which provides immutable, thread-safe,
//        and easier-to-use classes.

//        LocalDate now = LocalDate.now();
//        System.out.println(now);
//        LocalDate myDob = LocalDate.of(2001, 12, 12);
//
//        int dayofMonth = now.getDayOfMonth();
//        System.out.println(dayofMonth);
//        Month month = now.getMonth();
//        int month = now.getMonthValue();
//        int year = now.getYear();
//        System.out.println(month);
//        System.out.println(year);

        LocalDate today = LocalDate.now();
        LocalDate customDate = LocalDate.of(2001, 12, 12);
        LocalDate localDate = today.minusDays(1);

        LocalDate pastDate = today.minusMonths(100);

        System.out.println(localDate);
        System.out.println(pastDate);




    }
}
