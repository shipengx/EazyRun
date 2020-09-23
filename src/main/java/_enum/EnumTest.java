package _enum;

/**
 * A Java Enum is a special Java type used to define collections of constants.
 * More precisely, a Java enum type is a special kind of Java class.
 * An enum can contain constants, methods etc.
 * Java enums were added in Java 5.
 *
 * Enum toString()
 * an enum class automatically gets toString() method in the class when compiled.
 * the toString() method returns a string value of the name of the given enum instance.
 * here is an example:
 * String levelText = Level.HIGH.toString();
 * The value of the levelText variable after execution of the above statement will be the text HIGH.
 *
 * Enum Printing
 * if you print an enum, like this:
 * System.out.println(Level.HIGH);
 * then the toString() method will get called behind the scenes.
 * so the value that will be printed out is the textual name of the enum instance.
 * in other words, in the example above the text HIGH would have been printed.
 *
 * Enum valueOf()
 * An enum class automatically gets a static valueOf() method in the class when compiled.
 * The valueOf() method can be used to obtain an instance of the enum class for a given String value.
 * Here is an example:
 * Level level = Level.valueOf("HIGH");
 * The level variable will point to the Level.HIGH after executing this line.
 *
 *
 */


public class EnumTest {

    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level level = Level.HIGH;
        System.out.println("level is : " + level);

        System.out.println(Level.LOW.toString());

        System.out.println(Level.valueOf(null));
    }
}
