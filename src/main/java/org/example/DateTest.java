package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

    public static void main(String[] args) {

        System.out.println("hahajk.com");
        String dateStr = "01042019";
        System.out.println(changeDateFormat(dateStr));
    }


    private static Date StringToDate(String dob) throws ParseException {
        if (dob == null || dob.length() == 0) {
            return null;
        }
        //Instantiating the SimpleDateFormat class
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");
        //Parsing the given String to Date object
        Date date = formatter.parse(dob);
        System.out.println("Date object value: "+date);
        return date;
    }

    private static String changeDateFormat(String dateStr) {
        if (dateStr == null || dateStr.length() == 0) {
            return null;
        }
        String result = null;
        try {
            Date date = StringToDate(dateStr);
            result = new SimpleDateFormat("yyyy-MM-dd").format(date);
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
