package predicate;

import java.util.function.Predicate;

public class SecMainn {
    public static void main(String[] args) {
        Predicate<String> startWithV = x -> x.toLowerCase().charAt(0) == 'v';
        System.out.println(startWithV.test("Sachin"));

    }
}
