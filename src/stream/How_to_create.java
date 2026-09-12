package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class How_to_create {
    public static void main(String[] args) {
        // converting from list
        List<String> list = Arrays.asList("Sachin", "Nitin", "Utkarsh");
        Stream<String> myStream = list.stream();  // convert list(Collection) into stream

        // this is how array convert into stream
        String[] array = {"banana", "mango", "Avacado"};
        Stream<String> stream = Arrays.stream(array);

        //How directly use stream without converting , directly comma separated
        Stream<Integer> integerStream = Stream.of(1,2,3);

        // create stream with iterate and limit
        Stream<Integer> limit = Stream.iterate(0, n->n+1).limit(50); // seed- starting value, limit - ending
//        limit.forEach(System.out::println); // :: is method reference operator here
        limit.filter(n->n%2==0).forEach(System.out::println);

        // supplier using generate
        Stream<Integer> limit1 = Stream.generate(() ->(int) Math.random() *100 ).limit(5);

        // if wann a loop then use iterate and if wana generate then use generate
    }
}
