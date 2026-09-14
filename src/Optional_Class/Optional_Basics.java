package Optional_Class;

import java.util.Optional;

public class Optional_Basics {
    public static void main(String[] args) {
        // Optional class in Java 8 is a container wrapper that either holds a non-null value or is empty ||
        // It is primarily used to prevent NullPointerExceptions by forcing developers to explicitly handle the absence of values.

//        String name = getName(2);
//        System.out.println(name.toUpperCase());
        // these below are  just extra faltu code let do with optional class 😁
//        if (name != null){
//            System.out.println(name.toUpperCase());
//        }

        Optional<String> name = getName(2);
        if (name.isPresent()){
            System.out.println(name.get()); // if we pprint with only name without get() then it print with Optional
        }

    }
    private static Optional<String> getName(int id){
            //get from db

        String name = "Ram";
        return Optional.of(name);
    }
}
