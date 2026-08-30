package AbstractMethod;

abstract class Animal {
    // Abstract method
    abstract void sound();
    // Normal method
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {

    // Implementing abstract method
    @Override
    void sound() {
        System.out.println("Dog says: Bark");
    }
}

public class Abs {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.sound();
        dog.eat();
    }
}