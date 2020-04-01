package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        String[] A = new String[] {"abck", "abok", "ak"};
        List<String> res = getCommons(A);
        for (String s : res) {
            System.out.println(s);
        }


        /*
        int j = 3;
        while (j > 0) {
            System.out.println(j);
            j--;
        }
         */

    }

    private static List<String> getCommons(String[] strings) {

        List<String> result = new ArrayList<>();

        int[] count = new int[26];
        Arrays.fill(count, Integer.MAX_VALUE);

        for (String a : strings) {
            int[] tmp = new int[26];
            for (char c : a.toCharArray()) {
                tmp[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                count[i] = Math.min(tmp[i], count[i]);
            }
        }

        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                result.add("" + (char)(i + 'a'));
                count[i]--;
            }
        }

        return result;
    }

}
