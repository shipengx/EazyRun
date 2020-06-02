package ArrayToListConvert;

import java.util.Arrays;
import java.util.List;

public class ArrayAndListConvertExample {

    public static void main(String[] args) {

        // convert list to array
        List<Integer> sourceList = Arrays.asList(0, 1, 2, 3, 4, 5);
        Integer[] targetArray = sourceList.toArray(new Integer[sourceList.size()]);
        Arrays.stream(targetArray).forEach(System.out::println);

        // convert array to list
        Integer[] sourceArray = { 0, 1, 2, 3, 4, 5 };
        List<Integer> targetList = Arrays.asList(sourceArray);
        targetList.stream().forEach(System.out::println);

    }
}
