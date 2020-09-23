package TimeClasses;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeExample {

    public static void main(String[] args) {

        OffsetDateTime d = OffsetDateTime.of(LocalDate.of(2015, 10, 18),
                LocalTime.of(11, 20, 30, 1000),
                ZoneOffset.ofHours(-5));
        System.out.println(d);

        // Obtains an instance of OffsetDateTime from a date, time and offset.
        OffsetDateTime d2 = OffsetDateTime.of(LocalDate.now(),
                LocalTime.now(),
                ZoneOffset.UTC);
        System.out.println(d2);




    }
}
