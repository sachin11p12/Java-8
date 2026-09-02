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

        Map<Integer, String> mm = new TreeMap<>((a,b) -> b-a);
        mm.put(4,"Ayush");
        mm.put(2,"Inder");
        mm.put(7,"Ritika");
        mm.put(0,"Daksh");
        System.out.println("After manual sorting desc : " + mm);
    }
}
