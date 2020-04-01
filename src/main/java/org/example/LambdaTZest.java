package org.example;

public class LambdaTZest {

    public static void main(String[] args) {

        MyInterface myInterface;
        myInterface = () -> {
            double pi = 3.1415;
            System.out.println("Shipeng Xu");

            if (getValue()) {
                return;
            }
            System.out.println("Aloha, my friend.");
        };

        myInterface.getPiValue();
    }

    private static boolean getValue() {
        return true;
    }

}

@FunctionalInterface
interface MyInterface{

    void getPiValue();
}
