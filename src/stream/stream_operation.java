package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream_operation {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,4,4,4,78,4,90);
        List<Integer> filterList = list.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
        System.out.println(filterList);
        List<Integer> mappedList = filterList.stream().map(x -> x / 2).collect(Collectors.toList());
        System.out.println(mappedList);

    }
}
