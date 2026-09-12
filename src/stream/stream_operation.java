package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream_operation {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,60,7,4,48,4,78,4,90);
        List<Integer> filterList = list.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
//        System.out.println(filterList);

        List<Integer> mappedList = filterList.stream().map(x -> x / 2).collect(Collectors.toList());
//        System.out.println(mappedList);

        //in above repitition found so we don't need it then use
        List<Integer> distinctlist = filterList.stream().map(x -> x / 2).distinct().collect(Collectors.toList());
//        System.out.println(distinctlist);

        // now if we need sorted
        List<Integer> sortedList = filterList.stream().map(x -> x / 2).distinct().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
