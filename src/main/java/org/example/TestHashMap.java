package org.example;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("Shipeng", "Xu");
        map.put("Xiaoran", "An");



        System.out.println(map.isEmpty());
        System.out.println(map.size());


        String test = "s3://krux-consent/marketing-cloud/".substring(5).split("/")[0];
        System.out.println(test);


    }

}
