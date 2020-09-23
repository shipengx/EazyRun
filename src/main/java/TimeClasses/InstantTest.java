package TimeClasses;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class InstantTest {

    public static void main(String[] args) {

        Instant now = Instant.now();
        System.out.println("current instant is: " + now);

        // convert to offset
        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.UTC);
        System.out.println("offset date time : " + offsetDateTime);

        // convert it back to instant
        Instant now2 = offsetDateTime.toInstant();
        System.out.println("current instant2 is: " + now2);

    }

}
