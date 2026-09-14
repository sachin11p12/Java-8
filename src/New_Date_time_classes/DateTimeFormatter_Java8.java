package New_Date_time_classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_Java8 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);

        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String format = localDateTime.format(myFormatter);
        System.out.println(format);
    }
}
