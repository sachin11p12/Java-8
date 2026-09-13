package New_Date_time_classes;

import java.time.LocalTime;

public class LocalTime_Basic_opeartion {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
//        System.out.println(now);
        String timeInString = "14:30:45";
        LocalTime parsedTime = LocalTime.parse(timeInString);
        System.out.println(parsedTime);

        // there are multiple opeartion which in Time also same like in LocalDate !
    }
}
