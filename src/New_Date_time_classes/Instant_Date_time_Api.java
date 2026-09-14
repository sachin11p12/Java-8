package New_Date_time_classes;

import java.time.Instant;

public class Instant_Date_time_Api {
    public static void main(String[] args) {
        // it print current
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);
        Instant now = Instant.now();
        System.out.println(now);

    }
}
