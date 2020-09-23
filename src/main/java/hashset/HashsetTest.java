package hashset;

import java.util.HashSet;
import java.util.Set;

public class HashsetTest {

    public static void main(String[] args) {

        Car car1 = new Car("Honda", "blue");
        Car car2 = new Car("Honda", "blue");

        Set<Car> carSet = new HashSet<>();
        carSet.add(car1);

        if (carSet.contains(car2)) {
            System.out.println("contains car2");
        } else {
            System.out.println("does not contain car2");
        }

        Set<String> strs = new HashSet<>();
        strs.add("hahajk.com");

        if (strs.contains("hahajk.com")) {
            System.out.println("contained hahajk.com");
        }

    }
}
