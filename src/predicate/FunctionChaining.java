package predicate;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<String, Integer> function1 = x -> x.length();
        Function<String, String> function2 = s -> s.substring(0, 3);
    }
}
