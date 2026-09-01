package functional_Interface.comparatorr;

import java.util.Comparator;

public class MyClass implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return a-b;  // a-b for ascending , and b-a for descending.
    }
}
