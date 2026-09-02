package functional_Interface.comparatorr;

import java.util.Map;
import java.util.TreeMap;

public class TMain {
    public static void main(String[] args) {
        Map<Integer, String> m = new TreeMap<>();
        m.put(2, "Sachin");
        m.put(3, "Nitin");
        m.put(1, "Pawan");
        System.out.println("Before manual sorting : "+ m);

    }
}
