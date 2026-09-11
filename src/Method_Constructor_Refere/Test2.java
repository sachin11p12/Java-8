package Method_Constructor_Refere;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        List<String> namess = Arrays.asList("Sachin", "Tiwari", "Nitin");
        List<Student> students = namess.stream().map(Student::new).collect(Collectors.toList());  // using Constructor refe in place of lambda expression
    }
}
