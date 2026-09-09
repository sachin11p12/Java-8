package predicate;

import java.util.function.Supplier;

public class Supplier_Java {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 1;
        System.out.println(supplier.get());
    }
}
