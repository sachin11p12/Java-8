package Method_Constructor_Refere;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    //  when We need to give function as a parameter then we use method reference or Lambda expression

    public  void print(String s ){ // remove static
        System.out.println(s);
    }

    public static void main(String[] args) {
        Test1 test = new Test1();


        List<String> students = Arrays.asList("Sachin", "Nitin", "Utkarsh");
//        students.forEach(x-> System.out.println(x));
        students.forEach(test::print);  // :: this is method reference opeartor
//        System.out.println(hello()); // here we are invoking method but using :: method ref  opeartor we are not invoking
    }
//    private static int hello(){
//        return 1;
//    }
}
