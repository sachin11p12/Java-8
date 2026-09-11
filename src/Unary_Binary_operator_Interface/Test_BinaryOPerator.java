package Unary_Binary_operator_Interface;

import java.util.function.BinaryOperator;

public class Test_BinaryOPerator {
    public static void main(String[] args) {
        // Binary operator  takes two operands of the same type and returns a result of the same type,
        BinaryOperator<String> binaryOperator = (str1, str2) -> str1+str2;
        System.out.println(binaryOperator.apply("Sachin", " tiwari"));

    }
}
