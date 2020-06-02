package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;
import java.util.UUID;

public class LogTest {

    private static Logger LOG = LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args) {

        LOG.info("hahajk.com");

        //Optional<UUID> activationProfileJobId = Optional.ofNullable(UUID.randomUUID());
        Optional<UUID> activationProfileJobId = Optional.ofNullable(null);

        try {
            int x = 100 /0;
        } catch (Exception ex) {
            LOG.error(
                    "S3 partner activation failed for activation job id='{}'", activationProfileJobId.orElse(null), ex);
        }

        String a = "12";
        String b = a + "1";
        System.out.println("b is : " + b);


    }

}
