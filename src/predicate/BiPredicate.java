package predicate;
import java.util.function.*;
java.util.function.BiPredicate;

public class BiPredicate {
    public static void main(String[] args) {
        // it is used to let 2 numbers, string that give boolean output
        BiPredicate<Integer, Integer> biPredicate = (x,y) -> x%2 == 0  &&  y%2 == 0;
        System.out.println(biPredicate.test(2,4));
    }

}
