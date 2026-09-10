package Unary_Binary_operator_Interface;

import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        Function<Integer, Integer> function = x -> x*x;

        Function<String, String> function1 = str -> str.toLowerCase();
        Function<String, Integer> function2 = str -> str.length();
    }
}
