package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicTwo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Sachin", "Nitin", "Utkarsh");
        Stream<String> myStream = list.stream();  // convert list(Collection) into stream


        // this is how array convert into stream
        String[] array = {"banana", "mango", "Avacado"};
        Stream<String> stream = Arrays.stream(array);

        //How directly use stream without converting
        Stream<Integer> integerStream = Stream.of(1,2,3);

        // create stream with iterate and limit
        Stream<Integer> limit = Stream.iterate(0, n->n+1).limit(50); // seed- starting value, limit - ending
//        limit.forEach(System.out::println); // :: is method reference operator here
        limit.filter(n->n%2==0).forEach(System.out::println);
    }
}
