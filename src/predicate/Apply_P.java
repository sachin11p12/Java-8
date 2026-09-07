package predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Apply_P {
    public static void main(String[] args) {
        Function<String, Integer> function = x -> x.length();
//        System.out.println(function.apply("Sachin tiwari"));
        Function<String, String> function1 = s -> s.substring(0, 3);
//        System.out.println(function1.apply("Sachin"));

        Function<List<Student>, List<Student>> studentWithVIPasPrefix = li -> {
            List<Student> result = new ArrayList<>();
          for (Student s : li){
              if (function1.apply(s.getName()).equalsIgnoreCase("vip")){
                  result.add(s);
              }
          }
          return result;
        };
        Student s1 = new Student(2, "vipul");
        Student s2 = new Student(2, "vipulav");
        Student s3 = new Student(2, "Sachin");
        List<Student> students = Arrays.asList(s1, s2, s3);
        List<Student> filteredStudents = studentWithVIPasPrefix.apply(students);
        System.out.println(filteredStudents);

    }
    private static class Student {
        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private int id;
        private String name;
    }
}
