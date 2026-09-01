package functional_Interface.comparatorr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Comparator is also a functional interface Used to define custom sorting logic .
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(20);
        list.add(13);
        list.add(34);
        Collections.sort(list, new MyClass());
        System.out.println(list);
    }
}
