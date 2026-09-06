package predicate;

import java.util.function.Predicate;

public class SecMainn {
    public static void main(String[] args) {
        Predicate<String> startWithS = x -> x.toLowerCase().charAt(0) == 's';
        Predicate<String> endWithN = x -> x.toLowerCase().charAt(x.length()-1) == 'n';
        // -and
//        Predicate<String> and = startWithS.and(endWithN);
//        System.out.println(and.test("Sachin"));
        // - or
//        Predicate<String> or = startWithS.or(endWithN);
//        System.out.println(or.test("Nitin"));
        // - negate
        System.out.println(startWithS.negate().test("aachin"));

    }
}
