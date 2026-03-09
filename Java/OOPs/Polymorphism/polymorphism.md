
# 🔥 Polymorphism (Complete Simple Explanation)

## 1️⃣ What is Polymorphism?

**Poly** = many  
**Morphism** = forms  

👉 **Polymorphism means one method can behave in multiple ways.**

### Simple Definition
Same method name but different behavior depending on the situation.

---

## 🧠 Real Life Example (Very Easy)

### Remote Control 📺

You press the same **Power Button**, but it works differently for:

- TV
- AC
- Speaker

Same action → different behavior

👉 That is **Polymorphism**.

---

# 💻 Types of Polymorphism in Java

There are **2 types**:

Polymorphism
     |
 -------------------------
 |                       |
Compile Time         Runtime
Polymorphism        Polymorphism
(Method Overloading) (Method Overriding)

---

# 1️⃣ Method Overloading (Compile-Time Polymorphism)

Same method name but **different parameters**.

## Example

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

}
```

### Usage

```java
Calculator c = new Calculator();

System.out.println(c.add(2,3));
System.out.println(c.add(2,3,4));
```

### Output

```
5
9
```

Same method name + Different parameters = **Method Overloading**.

---

## Real Project Example

Login system

```java
login(String email)
login(String email, String password)
login(String email, String password, String otp)
```

---

# 2️⃣ Method Overriding (Runtime Polymorphism)

Child class changes the behavior of parent method.

## Parent Class

```java
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }

}
```

## Child Class

```java
class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }

}
```

## Main

```java
Animal a = new Dog();
a.sound();
```

Output

```
Dog barks
```

---

# High Level Diagram

```
        Animal
          |
    ----------------
    |              |
   Dog            Cat
 sound()         sound()
 Bark            Meow
```

---

# Why Companies Use Polymorphism

Example Payment System

```
payment.process()
```

Internally it may call:

- UPI Payment
- Card Payment
- NetBanking Payment

Same method → different implementation.

---

# Overloading vs Overriding

| Feature | Overloading | Overriding |
|------|------|------|
| Occurs in | Same class | Parent + Child |
| Parameters | Must change | Must be same |
| Runtime decision | Compile time | Runtime |
| Purpose | Flexibility | Dynamic behavior |

---

# Important Interview Example

```java
class Shape {

    void draw() {
        System.out.println("Drawing shape");
    }

}

class Circle extends Shape {

    void draw() {
        System.out.println("Drawing circle");
    }

}
```

Main

```java
Shape s = new Circle();
s.draw();
```

Output

```
Drawing circle
```

---

# Memory Trick

Overloading → Same method, different parameters  
Overriding → Same method, different behavior

---

# Final Interview Definition

Polymorphism allows a method to perform different actions depending on the object that invokes it.
