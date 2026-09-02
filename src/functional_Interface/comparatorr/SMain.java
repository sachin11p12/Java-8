package functional_Interface.comparatorr;

import java.util.Set;
import java.util.TreeSet;

public class SMain {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();  // set is a Interface like hash set and treeSet, TreeSet keeps element in orders.
        s.add(22);
        s.add(1);
        s.add(24);
        s.add(8);
        System.out.println("Before Manual sorting " + s);
        Set<Integer>  ss = new TreeSet<>((a,b) -> b-a);
        ss.add(12);
        ss.add(56);
        ss.add(3);
        System.out.println("After manual sorting desc : "+ ss);
    }
}
