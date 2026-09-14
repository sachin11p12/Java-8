package Optional_Class;

public class Optional_Basics {
    public static void main(String[] args) {
        // Optional class in Java 8 is a container wrapper that either holds a non-null value or is empty ||
        // It is primarily used to prevent NullPointerExceptions by forcing developers to explicitly handle the absence of values.

        String name = getName(2);
//        System.out.println(name.toUpperCase());
        // these below are  just extra faltu code let do with optional class 😁
//        if (name != null){
//            System.out.println(name.toUpperCase());
//        }

    }
    private static String getName(int id){
        //get from db

        return null;
    }
}
