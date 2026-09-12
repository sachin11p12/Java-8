package stream;

import java.util.stream.Stream;

public class Stream_operationss {
    public static void main(String[] args) {
        Integer integer = Stream.iterate(0, x -> x + 1).limit(101).map(x -> x/20).distinct().max((a,b) -> a-b).get();
        System.out.println(integer);
    }
}
