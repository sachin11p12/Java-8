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
    }
}
