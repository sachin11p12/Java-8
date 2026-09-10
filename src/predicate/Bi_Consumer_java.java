package predicate;

import java.util.function.Consumer;

public class Bi_Consumer_java {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (x) -> {
            System.out.println(x);
        };
        consumer.accept(499);
    }
}
