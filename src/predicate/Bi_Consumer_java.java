package predicate;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Bi_Consumer_java {
    public static void main(String[] args) {
//        Consumer<Integer> consumer = (x) -> {
//            System.out.println(x);
//        };
//        consumer.accept(499);

        BiConsumer<Integer, Integer> biConsumer = (x,y) -> {
            System.out.println(x+y);
        };
        biConsumer.accept(2,90);
    }
}
