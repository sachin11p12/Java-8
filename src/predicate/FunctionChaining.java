package predicate;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<String, String> function1 = s -> s.toUpperCase();
        Function<String, String> function2 = s -> s.substring(0, 3);

        Function<String, String> stringStringFunction = function1.andThen(function2);
        System.out.println(stringStringFunction.apply("Sachin"));
    }
}
