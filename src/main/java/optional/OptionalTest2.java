package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("shipeng");
        list.add("aishwarya");

        Optional<List<String>> optionalList = Optional.ofNullable(list);

        if (optionalList.isPresent()) {
            List<String> list1 = optionalList.get();
            list1.remove("shipeng");
            list1.remove("aishwarya");
            list1.add("Jay");
            list1.add("Rajiv");
        }

        List<String> list2 = optionalList.get();
        System.out.println(list2);
        list2.remove("Jay");

        List<String> list3 = optionalList.get();
        System.out.println(list3);

    }
}
