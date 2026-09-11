package Unary_Binary_operator_Interface;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Test {
    public static void main(String[] args) {
        Function<Integer, Integer> function = x -> x*x;
        Function<String, String> function1 = str -> str.toLowerCase(); // here is Same input and output so we use Unary Operator

//        UnaryOperator<Integer> unaryOperator = x -> x*x;
//        System.out.println(unaryOperator.apply(7));

        UnaryOperator<String> unaryOperator2 = str-> str.toLowerCase();
        System.out.println(unaryOperator2.apply("SACHIN TIWARi"));



    }
}
