package defaultMethod;

interface A{
    default void sayHello(){
        System.out.println("A say Hello");
    }
}
interface B{
    default void sayHello(){
        System.out.println("B say Hello");
    }
}
public class SeconndClass implements A,B{
    public static void main(String[] args) {

        MyClass m = new MyClass();
    }
    public void sayHello(){
        B.super.sayHello();
    }
}
