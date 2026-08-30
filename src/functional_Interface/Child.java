package functional_Interface;

@FunctionalInterface
public interface Child extends Parent {
    public void sayHello();
    default void sayBye(){

    };
}
