package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {

        System.out.println("hahajk.com");

        List<String> list1 = new ArrayList<String>();
        list1.add("one");
        list1.add("two");

        List<String> list2 = null;

        Optional<List<String>> alist = Optional.ofNullable(list1);
        if (alist.isPresent()) {
            System.out.println("here's some items.");
        }

        Optional<List<String>> blist = Optional.ofNullable(list2);
        if (blist.isPresent()) {
            System.out.println("here's some itmes.");
        } else {
            System.out.println("here's nothing.");
        }

        alist.ifPresent(strs -> System.out.println(strs));


        //System.out.println(blist.get());

    }

}
