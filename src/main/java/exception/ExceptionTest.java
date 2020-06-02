package exception;

import java.util.ArrayList;

public class ExceptionTest {

    public static void main(String[] args) {

        try {
            //int x = 100 / 0;
            ArrayList<String> list = null;
            list.get(0);
        } catch (Exception ex) {
            String str = ex.toString();
            System.out.println("exception string is : " + str);
            ex.printStackTrace();
        }

    }

}
