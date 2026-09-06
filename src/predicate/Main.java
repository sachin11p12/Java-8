package predicate;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
    // predicate is boolean value function
        Predicate<Integer> salaryGreaterThanLac = x -> x > 10000;
        System.out.println(salaryGreaterThanLac.test(1000000));
    }
}
