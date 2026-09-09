package predicate;

import java.util.function.Consumer;

public class Consumer_Interface {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Sachin");
    }
}
