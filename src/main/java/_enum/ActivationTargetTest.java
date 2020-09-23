package _enum;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ActivationTargetTest {

    public static void main(String[] args) throws Exception {

        ActivationTarget target = new ActivationTarget();
        target.setEnabled(true);
        target.setName("target name");
        target.setTargetId("target id");
        target.setTargetType("SFMC");

        ObjectMapper objectMapper = new ObjectMapper();
        String targetStr = objectMapper.writeValueAsString(target);

        System.out.println("target is " + targetStr);
    }

}
