package predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
    // predicate is boolean value function
//        Predicate<Integer> salaryGreaterThanLac = x -> x > 10000;
//        System.out.println(salaryGreaterThanLac.test(1000000));

//        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
//        int sum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(n -> n).sum();

        // above are  predicate which was written in normal login in below
//        int sum2 = 0;
//        for (int number : numbers){
//            if (number%2==0){
//                sum2 += number;
//            }
//        }


//        Predicate<Integer> predicate = x -> x > 10000;

        Predicate<Integer> isEven = x -> x % 2 == 0;  //test method
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        for (Integer i : numbers){
            if (isEven.test(i)){
                System.out.println(i);
            }
        }
        System.out.println("-------------ii-----------------");
        List<Integer> ele = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Predicate<Integer> odd = y -> y%2!=0;
        for (Integer e : ele){
            if (odd.test(e)){
                System.out.println(e);
            }
        }
    }
}
