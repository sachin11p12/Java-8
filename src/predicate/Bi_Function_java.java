package predicate;

import java.util.function.BiFunction;

public class Bi_Function_java {
    public static void main(String[] args) {
        BiFunction<String, String, Integer> biFunction = (x, y) -> x.length() + y.length();
        System.out.println(biFunction.apply("hi", "Sachin"));

    }
}
