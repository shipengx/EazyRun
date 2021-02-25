package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


/**
 * Supplier<T>    T get()            () -> "hello!";
 * Consumer<T>    void accept(T t)   (String s) -> System.out.println(s);
 * Predicate<T>   boolean test(T t)  (string s) -> string.isEmpty()
 * Function<T,R>  R apply(T t)       user -> user.getName()
 * Runnable       void run()         () -> System.out.println("I am alive. ")
 *
 * Lambdas are not instances of anonymous classes
 *
 * auto-boxing is the process of converting int to integer.
 *
 * A lambda expression has three parts:
 *
 * 1. A list of parameters
 *  A lambda expression can have zero (represented by empty parentheses), one or more parameters.
 *  e.g.
 *  () -> System.out.println("Hi");
 *  (String s) -> System.out.println(s);
 *  (String s1, String s2) -> System.out.println(s1 + s2);
 *
 *  The type of the parameters can be declared explicitly, or it can be inferred from the context:
 *  (s) -> System.out.println(s);
 *  If there is a single parameter, the type is inferred and is not mandatory to use parentheses:
 *  s -> System.out.println(s);
 *
 *  if the lambda expression uses a parameter name the same as a variable name of the enclosing context, a compiler error is generated:
 *  // this does not compile
 *  String s = ""; s -> System.out.println(s);
 *
 * 2. An Arrow
 *  Formed by the characters - and > to separate the parameters and the body.
 *
 * 3. A body
 *      the body of the lambda expressions can contain one or more statements
 *      if the body has one statement, curly brackets are not required and the value of the expression (if any) is returned:
 *      () -> 4; (int a) -> a * 6;
 *      if the body has more than one statement, curly brackets are required, and if the expression returns a value,
 *      it must be returned with a return statement:
 *      () -> {
 *          System.out.println("hi");
 *          return 4;
 *      }
 *      (int a) -> {
 *          System.out.println(a);
 *          return a * 6;
 *      }
 *      returning is not necessary with lambda expressions. For example, the following are equivalent:
 *      () -> System.out.println("Hi");
 *      () -> {
 *          System.out.println("Hi");
 *          return;
 *      }
 *
 * The signature of the abstract method of a functional interface provides the signature of a lambda expression
 * (this signature is called a functional descriptor).
 *
 * This means that to use a lambda expression, you first need a functional interface, which is just a fancy name
 * for an interface with one method.
 * for example:
 *  interface Searchable {
 *      boolean test(Car car);
 *  }
 *
 *
 */

public class SupplierConsumerExample {

    static class User {
        String name;

        User(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String toString() {
            return "name : " + this.name;
        }
    }

    public static void main(String[] args) {

        // Supplier  ==>> return something
        Supplier<String> supplier = () -> "Hello!";

        String string = supplier.get();
        System.out.println("string = " + string);

        // Consumer ==>> doesn't return anything, just does something
        Consumer<String> consumer = (String s) ->  {
            System.out.println("I am inside the Consumer.");
            System.out.println(s);
        };
        consumer.accept("hello");


        List<String> strings = new ArrayList<>(List.of("one", "two", "three", "four", "five"));

        Predicate<String> filter = (String s1) -> !s1.startsWith("t");
        strings.removeIf(filter);

        Consumer<String> action = (String s2) -> {
            System.out.println(s2);
        };
        strings.forEach(action);

        // strings.removeIf(string -> !string.startsWith("t"));
        // strings.forEach(string -> System.out.println(string));


        User sarah = new User("Sarah");
        User james = new User("James");
        User mary = new User("Mary");
        User john = new User("John");

        List<User> users = List.of(sarah, james, mary, john);
        List<String> names = new ArrayList<>();
        Function<User, String> toName = (User user) -> user.getName();

        for (User user : users) {
            String name = toName.apply(user);
            names.add(name);
        }
        Consumer<User> action1 = (User u) -> System.out.println(u);
        users.forEach(action1);

        names.forEach(s -> System.out.println(s));
    }
}
