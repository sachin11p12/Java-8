package predicate;

import java.util.function.Function;

public class Apply_P {
    public static void main(String[] args) {
        Function<String, Integer> function = x -> x.length();
        System.out.println(function.apply("Sachin tiwari"));
    }
}
