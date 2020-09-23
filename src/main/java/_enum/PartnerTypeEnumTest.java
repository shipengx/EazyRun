package _enum;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PartnerTypeEnumTest {

    public static void main(String[] args) {

        PartnerType partnerType = PartnerType.S3;
        System.out.println(PartnerType.S3.name());


        System.out.println(PartnerType.valueOf("MarketingCloud").name());

        // no need to deserialize back
    }

}
