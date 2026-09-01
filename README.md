# Java 8 Features & Core OOP Concepts ☕

A hands-on Java 8 learning repository containing practical examples and code walkthroughs for core Java 8 features, interface enhancements, functional programming concepts, and OOP principles.

---

## 📑 Table of Contents

- [Overview](#-overview)
- [📁 Project Structure](#-project-structure)
- [✨ Key Topics Covered](#-key-topics-covered)
  - [1. Abstract Methods & Classes](#1-abstract-methods--classes)
  - [2. Default Methods in Interfaces](#2-default-methods-in-interfaces)
  - [3. Static Methods in Interfaces](#3-static-methods-in-interfaces)
  - [4. Functional Interfaces & Inheritance](#4-functional-interfaces--inheritance)
  - [5. Lambda Expressions & Multithreading](#5-lambda-expressions--multithreading)
- [🚀 How to Run](#-how-to-run)
- [📌 Key Java 8 Takeaways](#-key-java-8-takeaways)

---

## 📖 Overview

Prior to Java 8, interfaces could only contain abstract method declarations and public static final constants. Java 8 introduced significant paradigm shifts by introducing **Default Methods**, **Static Methods in Interfaces**, **Functional Interfaces**, and **Lambda Expressions**, paving the way for functional programming in Java.

This repository demonstrates these core capabilities with clean, concise code examples.

---

## 📁 Project Structure

```text
src/
├── AbstractMethod/
│   └── Abs.java                 # Abstract class and method overriding
├── defaultMethod/
│   ├── MyClass.java             # Default method declaration & overriding
│   └── SeconndClass.java        # Resolving multiple inheritance conflict (Diamond Problem)
├── functional_Interface/
│   ├── Parent.java              # Base interface with SAM (Single Abstract Method)
│   ├── Child.java               # Inherited @FunctionalInterface with default methods
│   ├── MyInterface.java         # Standard @FunctionalInterface declaration
│   └── MainFI.java              # Functional interface driver
├── lambdaFunction/
│   ├── Employee.java            # Custom functional interface
│   └── Main.java                # Lambda syntax and Runnable thread execution
├── StaticMethod/
│   ├── MyInterface.java         # Interface containing static main method
│   ├── MyClasss.java            # Standard class main method execution
│   ├── SMain.java               # Interface static methods vs default methods
│   └── S2Main.java              # Class static methods and inheritance
└── Main.java                    # Top-level Lambda expression demo with custom Calculator
```

---

## ✨ Key Topics Covered

### 1. Abstract Methods & Classes
* **Location:** [`src/AbstractMethod/Abs.java`](file:///c:/Users/Sachin%20Tiwari/Desktop/java%208/src/AbstractMethod/Abs.java)
* **Concept:** Demonstrates the traditional abstract class construct where a parent class (`Animal`) defines abstract behavior (`sound()`) and concrete behavior (`eat()`), enforced and implemented by derived classes (`Dog`).

---

### 2. Default Methods in Interfaces
* **Location:** [`src/defaultMethod/`](file:///c:/Users/Sachin%20Tiwari/Desktop/java%208/src/defaultMethod/)
* **Concepts:**
  * **Backward Compatibility:** Add new methods to interfaces without breaking existing implementing classes ([`MyClass.java`](file:///c:/Users/Sachin%20Tiwari/Desktop/java%208/src/defaultMethod/MyClass.java)).
  * **Diamond Problem Resolution:** When a class implements multiple interfaces having default methods with identical signatures, Java mandates resolving the ambiguity using `InterfaceName.super.methodName()` ([`SeconndClass.java`](file:///c:/Users/Sachin%20Tiwari/Desktop/java%208/src/defaultMethod/SeconndClass.java)).

```java
public class SeconndClass implements A, B {
    @Override
    public void sayHello() {
        B.super.sayHello(); // Resolves ambiguity explicitly
    }
}
```

---

### 3. Static Methods in Interfaces
* **Location:** [`src/StaticMethod/`](file:///c:/Users/Sachin%20Tiwari/Desktop/java%208/src/StaticMethod/)
* **Concepts:**
  * **Utility Methods:** Static methods in interfaces belong to the interface itself and cannot be overridden by implementing classes ([`SMain.java`](file:///c:/Users/Sachin%20Tiwari/Desktop/java%208/src/StaticMethod/SMain.java)).
  * **Executing Main in Interface:** Since Java 8, you can write and execute a `public static void main(String[] args)` method directly inside an interface ([`MyInterface.java`](file:///c:/Users/Sachin%20Tiwari/Desktop/java%208/src/StaticMethod/MyInterface.java)).

---

### 4. Functional Interfaces & Inheritance
* **Location:** [`src/functional_Interface/`](file:///c:/Users/Sachin%20Tiwari/Desktop/java%208/src/functional_Interface/)
* **Concepts:**
  * **Single Abstract Method (SAM):** An interface marked with `@FunctionalInterface` must contain exactly one abstract method ([`MyInterface.java`](file:///c:/Users/Sachin%20Tiwari/Desktop/java%208/src/functional_Interface/MyInterface.java)).
  * **Inheritance Rules:** A child functional interface can inherit an abstract method from a parent interface and still remain a functional interface, provided it does not add any new abstract methods ([`Child.java`](file:///c:/Users/Sachin%20Tiwari/Desktop/java%208/src/functional_Interface/Child.java)). Default and static methods are permitted.

---

### 5. Lambda Expressions & Multithreading
* **Location:** [`src/lambdaFunction/`](file:///c:/Users/Sachin%20Tiwari/Desktop/java%208/src/lambdaFunction/) and [`src/Main.java`](file:///c:/Users/Sachin%20Tiwari/Desktop/java%208/src/Main.java)
* **Concepts:**
  * **Concise Syntax:** Replaces boilerplate anonymous inner classes with concise lambda expressions `(parameters) -> expression`.
  * **Thread & Runnable:** Implementing `Runnable` with a lambda to start background threads without explicit `Runnable` class instantiation.

```java
// Lambda with custom Functional Interface
Calculator calculator = (a, b) -> a + b;
int result = calculator.add(10, 20);

// Lambda with Runnable interface
Runnable runnable = () -> {
    for (int i = 1; i <= 10; i++) {
        System.out.println("Hello " + i);
    }
};
Thread childThread = new Thread(runnable);
childThread.run();
```

---

## 🚀 How to Run

### Prerequisites
- **JDK 8 or higher** installed.

### Compilation and Execution via Command Line

1. **Compile all Java source files:**
   ```bash
   javac -d out src/Main.java src/**/*.java
   ```

2. **Run a specific example:**
   - **Main Calculator Lambda Demo:**
     ```bash
     java -cp out Main
     ```
   - **Default Methods Diamond Problem Demo:**
     ```bash
     java -cp out defaultMethod.SeconndClass
     ```
   - **Static Method in Interface Demo:**
     ```bash
     java -cp out StaticMethod.MyInterface
     ```
   - **Lambda Function Thread Demo:**
     ```bash
     java -cp out lambdaFunction.Main
     ```

---

## 📌 Key Java 8 Takeaways

| Feature | Purpose / Advantage | Key Syntax / Rule |
| :--- | :--- | :--- |
| **Lambda Expression** | Concise way to represent one-method interfaces (Functional Interfaces) | `(params) -> { body }` |
| **`@FunctionalInterface`** | Guarantees Single Abstract Method (SAM) at compile time | Exactly 1 abstract method |
| **`default` Methods** | Add methods to interfaces with default implementation without breaking existing implementations | `default void method() { ... }` |
| **`static` Methods in Interfaces** | Provide utility methods directly attached to the interface | `static void util() { ... }` |
| **Interface `super` Resolution** | Resolves ambiguity in multiple interface inheritance | `InterfaceName.super.method()` |
