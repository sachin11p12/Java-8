package stream;

import java.util.Arrays;
import java.util.List;

public class parallel_stream {
    public static void main(String[] args) {
        // parallel stream divide big lists in chunks  and assigned thread  it has alll operation stream, so used only in big lists.

        List<Integer> list = Arrays.asList(1,2,3,4);
        list.parallelStream();
    }
}
