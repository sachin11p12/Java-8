# Java 8 Learning Project

A simple Java 8 practice project covering **Abstract Methods, Default Methods, Functional Interfaces, Lambda Expressions, Inheritance, and Polymorphism**.

## 📁 Project Structure

```text
src/
├── AbstractMethod/
│   └── Abs.java
├── defaultMethod/
│   ├── MyClass.java
│   └── SeconndClass.java
├── functional_Interface/
│   ├── Child.java
│   ├── MainFI.java
│   ├── MyInterface.java
│   └── Parent.java
└── Main.java

#  Concepts Covered
1. Abstract Method
An abstract method is a method that has no implementation. It defines what should be done, while the child class defines how it should be done.

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}