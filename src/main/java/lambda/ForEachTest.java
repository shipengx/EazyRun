package lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEachTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("haha");
        list.add("jk");

        list.forEach( item -> {
            System.out.println("first line");
            System.out.println("second line");
            System.out.println("third line");
            System.out.println(item);
            System.out.println();
        });

    }
}
