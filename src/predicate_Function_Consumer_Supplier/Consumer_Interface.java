package predicate_Function_Consumer_Supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_Interface {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s); // it is save not return anything

        Consumer<List<Integer>> listConsumer = li -> {
            for (Integer i : li){
                System.out.println(i+100);
            }
        };
//        consumer.accept("Sachin");
//        listConsumer.accept(Arrays.asList(1,2,4,5));

        Consumer<List<Integer>> listConsumer1 = li -> {
            for (Integer i : li){
                System.out.println(i);
            }
        };
        Consumer<List<Integer>> listConsumerUsedAndThen = listConsumer1.andThen(listConsumer);
        listConsumerUsedAndThen.accept(Arrays.asList(1,2,3,4));
    }
}
