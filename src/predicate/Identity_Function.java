package predicate;

import java.util.function.Function;

public class Identity_Function {
    public static void main(String[] args) {
//        Function<Integer, Integer> function3 = x -> 2*x;
//        Function<Integer, Integer> function4 = x -> x*x*x;
//        System.out.println(function3.andThen(function4).apply(3));
//        System.out.println(function4.andThen(function3).apply(3));

        Function<String, String> identityFunction = Function.identity();  // it will clearly use in stream
        System.out.println(identityFunction.apply("Sachin"));
    }
}
