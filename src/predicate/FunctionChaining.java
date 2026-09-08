package predicate;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
//        Function<String, String> function1 = s -> s.toUpperCase();
//        Function<String, String> function2 = s -> s.substring(0, 3);

//        Function<String, String> stringStringFunction = function1.andThen(function2);
//        System.out.println(function1.andThen(function2).apply("Sachin"));
//        System.out.println(stringStringFunction.apply("Sachin"));

        Function<Integer, Integer> function1 = x -> 2*x;
        Function<Integer, Integer> function2 = x -> x*x*x;
        System.out.println(function1.andThen(function2).apply(3));  //216
//        System.out.println(function2.andThen(function1).apply(3));

        System.out.println(function1.compose(function2).apply(3)); //54
    }
}
