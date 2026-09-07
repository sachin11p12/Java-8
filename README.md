# ☕ Mastering Java 8 — Notes & Practical Examples

Welcome! 👋 This repository is a hands-on learning playground and quick-reference guide for understanding modern Java features introduced in **Java 8**. 

Java 8 was a massive milestone for Java developers. It bridged the gap between traditional Object-Oriented Programming (OOP) and functional programming, introducing cleaner syntax, less boilerplate code, and powerful new tools for writing expressive applications.

---

## 📌 What's in this Repo?

Here’s how the project is organized, with each package focused on a specific core concept:

```text
src/
├── AbstractMethod/
│   └── Abs.java                 # Traditional OOP: Abstract classes & method overriding
├── defaultMethod/
│   ├── MyClass.java             # Default methods in interfaces & overriding them
│   └── SeconndClass.java        # Resolving interface conflicts (The Diamond Problem)
├── functional_Interface/
│   ├── Parent.java              # Interface with a Single Abstract Method (SAM)
│   ├── Child.java               # Interface inheritance with default methods
│   ├── MyInterface.java         # Using @FunctionalInterface annotation
│   └── MainFI.java              # Playground driver class
├── lambdaFunction/
│   ├── Employee.java            # Custom Single Abstract Method interface
│   └── Main.java                # Lambda syntax in action & multithreading with Runnable
├── StaticMethod/
│   ├── MyInterface.java         # Running main() directly inside an interface!
│   ├── MyClasss.java            # Standard class main method comparison
│   ├── SMain.java               # Interface static methods vs default methods
│   └── S2Main.java              # Static inheritance in classes
└── Main.java                    # Top-level quick demo: Lambdas + custom Calculator
```

---

## 💡 Concepts Explained (The "Why" & "How")

### 1. Abstract Methods vs Concrete Methods in Abstract Classes
📁 **File:** [`src/AbstractMethod/Abs.java`](file:///c:/Users/Sachin%20Tiwari/Desktop/java%208/src/AbstractMethod/Abs.java)

* **The Problem:** Sometimes you want a base class that defines common behavior for all subclasses, but forces child classes to provide their own specific implementation for certain actions.
* **The Solution:** An `abstract` class can have both *concrete methods* (with bodies) and *abstract methods* (without bodies).
* **In this example:** `Animal` provides a default `eat()` method, but forces `Dog` to implement its own `sound()` method.

---

### 2. Default Methods in Interfaces (Why were they added?)
📁 **Files:** [`src/defaultMethod/MyClass.java`](file:///c:/Users/Sachin%20Tiwari/Desktop/java%208/src/defaultMethod/MyClass.java) & [`src/defaultMethod/SeconndClass.java`](file:///c:/Users/Sachin%20Tiwari/Desktop/java%208/src/defaultMethod/SeconndClass.java)

* **The Problem before Java 8:** If you added a new method to an existing interface, *every single class* implementing that interface across the world would immediately break until updated.
* **The Java 8 Solution:** You can now provide a `default` implementation right inside the interface! Existing implementing classes get the new functionality for free without breaking.
* **Overriding:** Child classes can still choose to override default methods if they need custom behavior.

#### ⚔️ The Diamond Problem & How Java Resolves It
What happens when class `C` implements interfaces `A` and `B`, and both have a default method `sayHello()`?
Java refuses to guess and throws a compile error. You have to resolve the ambiguity yourself using `InterfaceName.super.method()`:

```java
public class SeconndClass implements A, B {
    @Override
    public void sayHello() {
        // Explicitly choose which parent's default method to call
        B.super.sayHello();
    }
}
```

---

### 3. Static Methods inside Interfaces
📁 **Files:** [`src/StaticMethod/`](file:///c:/Users/Sachin%20Tiwari/Desktop/java%208/src/StaticMethod/)

* **Why it's useful:** Before Java 8, utility methods related to an interface usually lived in a separate utility class (e.g., `Collections` for `Collection`). Java 8 allows static helper/utility methods directly inside the interface.
* **Key Rule:** Interface static methods belong strictly to the interface. You cannot override them, and they are called via `InterfaceName.methodName()`.
* **Fun Fact:** You can now even run a `main` method directly inside an interface file! Check out [`MyInterface.java`](file:///c:/Users/Sachin%20Tiwari/Desktop/java%208/src/StaticMethod/MyInterface.java).

---

### 4. Functional Interfaces (`@FunctionalInterface`)
📁 **Files:** [`src/functional_Interface/`](file:///c:/Users/Sachin%20Tiwari/Desktop/java%208/src/functional_Interface/)

* **What is it?** Any interface that contains **exactly one abstract method** (SAM - Single Abstract Method).
* **The `@FunctionalInterface` annotation:** It's optional, but great practice. It tells the compiler to yell at you if you accidentally add a second abstract method to the interface.
* **What about Default and Static methods?** You can have as many default and static methods as you want — as long as there is only one abstract method, it remains a valid Functional Interface!

---

### 5. Lambda Expressions (Say Goodbye to Boilerplate!)
📁 **Files:** [`src/lambdaFunction/Main.java`](file:///c:/Users/Sachin%20Tiwari/Desktop/java%208/src/lambdaFunction/Main.java) & [`src/Main.java`](file:///c:/Users/Sachin%20Tiwari/Desktop/java%208/src/Main.java)

* **What is it?** An anonymous function — essentially a method without a name, return type, or access modifier.
* **Why use it?** Instead of writing verbose anonymous inner classes, you can pass behavior as data in a single line.

#### Example 1: Custom Functional Interface
```java
// Instead of writing a full class or bulky anonymous inner class:
Calculator calculator = (a, b) -> a + b;
System.out.println(calculator.add(10, 20)); // Outputs: 30
```

#### Example 2: Multithreading with `Runnable`
```java
// Super clean thread definition using a lambda block:
Runnable runnable = () -> {
    for (int i = 1; i <= 10; i++) {
        System.out.println("Hello " + i);
    }
};

Thread childThread = new Thread(runnable);
childThread.run();
```

---

## 🏃 Running the Code Locally

Want to run these examples on your machine?

### 1. Compile all files
Open your terminal in the project root directory and run:
```bash
javac -d out src/Main.java src/**/*.java
```

### 2. Execute any example:
```bash
# Run the top-level Lambda Calculator demo
java -cp out Main

# Run the Multiple Inheritance / Diamond Problem demo
java -cp out defaultMethod.SeconndClass

# Run the Static Interface Method demo
java -cp out StaticMethod.MyInterface

# Run the Lambda Multithreading demo
java -cp out lambdaFunction.Main
```

---

## 🧠 Cheat Sheet Summary

| Concept | What is it? | Why do we use it? |
| :--- | :--- | :--- |
| **Lambda Expression** | `(a, b) -> a + b` | Cuts boilerplate; lets us pass functions like parameters |
| **Functional Interface** | Interface with 1 abstract method | The foundation that makes lambda expressions possible |
| **Default Method** | `default void doWork() { ... }` | Adds new methods to interfaces without breaking existing code |
| **Static Interface Method** | `static void helper() { ... }` | Groups utility/helper methods directly with the interface |
| **Conflict Resolution** | `InterfaceName.super.method()` | Disambiguates when multiple interfaces have identical default methods |

---

Today covered topis-
Predicate - AND, OR, nagate and isEqual , what is Defaukt ans static methods in the Prediacte 
Function - in FI - how to use apply(), andThen(),compose, identity() with proper exampl. 

Happy Coding! 🚀
