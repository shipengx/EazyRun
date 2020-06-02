package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Generating streams
 * With Java 8, Collection interface has two methods to generate a stream.
 *  stream() -- returns a sequential stream considering collection as its source.
 *  parallelStream() -- returns a parallel stream considering collection as its source.
 *
 * forEach
 * Stream has provided a new method 'forEach' to iterate through each element of the stream.
 * The following code segment shows how to print 10 random numbers using forEach.
 * Random random = new Random();
 * random.ints().limit(10).forEach(System.out::println);
 *
 * map
 * the 'map' method is used to map each element to its corresponding result.
 * //get list of unique squares
 * List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
 *
 * filter
 * the filter method is used to eliminate elements based on a criteria.
 * the following code segment prints a count of empty strings using filter.
 * //get count of empty string
 * int count = strings.stream().filter(string -> string.isEmpty()).count();
 *
 * limit
 * the 'limit' method is used to reduce the size of the stream.
 * the following code segment shows how to print 10 random numbers using limit.
 * Random random = new Random();
 * random.ints().limit(10).forEach(System.out::println);
 *
 *
 *
 */

public class StreamExample {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("abc", "def", "hij");
        List<String> filtered = strings.stream().filter(string -> !string.equals("abc")).collect(Collectors.toList());
        System.out.println(filtered);

        filtered.forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        // get a list of unique squares
        List<Integer> squareList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        squareList.forEach(System.out::println);

        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();
        streamOfCollection.forEach(System.out::println);

        List<Integer> nullCollection = null;
        Stream<Integer> nullStream = Optional.ofNullable(nullCollection).map(Collection::stream).orElseGet(Stream::empty);
        nullStream.collect(Collectors.toList());

        Stream<String> resultStream = nullCollection == null ? Stream.empty() : collection.stream();

        // null pointer exception like below
        //List<Integer> nulls = null;
        //nulls.stream().collect(Collectors.toList());

    }
}
