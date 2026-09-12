package stream;

import java.util.stream.Stream;

public class Stream_operationss {
    public static void main(String[] args) {
//        Integer integer = Stream.iterate(0, x -> x + 1).limit(101).map(x -> x/20).distinct().peek(System.out::println).max((a,b) -> a-b).get();
        Long integer = Stream.iterate(0, x -> x + 1).limit(101).map(x -> x/20).distinct().count();  // it use Long
        System.out.println(integer);
    }
}
