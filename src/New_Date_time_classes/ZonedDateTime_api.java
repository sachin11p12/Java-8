package New_Date_time_classes;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTime_api {
    public static void main(String[] args) {
        // it is also same like LocalDateTime and UTC(Coordinated Universal Time.) Zoned time and Date

        ZonedDateTime zone = ZonedDateTime.now();
//        System.out.println(zone);
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();

        System.out.println(availableZoneIds);

    }
}
