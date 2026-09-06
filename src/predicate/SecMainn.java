package predicate;

import java.util.function.Predicate;

public class SecMainn {
    public static void main(String[] args) {
        Predicate<String> startWithS = x -> x.toLowerCase().charAt(0) == 's';
        Predicate<String> endWithN = x -> x.toLowerCase().charAt(x.length()-1) == 'n';
        Predicate<String> and = startWithS.and(endWithN);
        System.out.println(and.test("Sachin"));

    }
}
