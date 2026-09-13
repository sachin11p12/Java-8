package New_Date_time_classes;

import java.time.LocalDate;

public class Basic_Two {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate customDate = LocalDate.of(2001, 12, 12);
        LocalDate yesterday = today.minusDays(1);

        if (today.isAfter(yesterday)){
            System.out.println("Yes i am Sachin !");
        }
    }
}
