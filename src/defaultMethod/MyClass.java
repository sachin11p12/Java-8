package defaultMethod;

interface Parent{
    default void sayHello(){
        System.out.println("Helo sachin");
    }
}
class Child implements Parent{
    @Override
    public void sayHello() {
        System.out.println("child says Hello");
    }
}
public class MyClass {
    public static void main(String[] args) {
        Child c = new Child();
        c.sayHello();
    }
}
