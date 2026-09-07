package predicate;

import java.util.Objects;
import java.util.function.Predicate;

public class IsEqualP {
    public static void main(String[] args) {
        Predicate<String> startW_S = x -> x.toLowerCase().charAt(0) == 's';
        Predicate<String> endW_N = x -> x.toLowerCase().charAt(x.length()-1) == 'n';
        Student s1 = new Student("Sachin", 1);
        Student s2 = new Student("Ram", 2);
//        Predicate<Student> studentPredicate = x -> x.getId() > 1;
//        System.out.println(studentPredicate.test(s2));
        Predicate<Object> predicate = Predicate.isEqual(4);
        System.out.println(predicate.test(7));
    }


    public static class Student{
        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        String name;
        int id;
    }
}
