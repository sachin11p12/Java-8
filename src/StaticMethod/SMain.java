package StaticMethod;

interface A{
    static void saySachin() {
        System.out.println("I am Sachin !");
    }
    default void sayNitin(){
        System.out.println("I am Nitin !");
    }
}
public class SMain implements A {
    public static void main(String[] args) {
        A.saySachin();
        SMain obj = new SMain();
        obj.sayNitin();
    }
}
