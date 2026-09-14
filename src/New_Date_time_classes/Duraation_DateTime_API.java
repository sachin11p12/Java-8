package New_Date_time_classes;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Duraation_DateTime_API {
    public static void main(String[] args) {
        Instant start = Instant.now();
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        LocalDateTime a = LocalDateTime.now();
        LocalDateTime b = LocalDateTime.now();

        Duration duration1 = Duration.between(a, b);
        System.out.println(duration1);
    }
}
