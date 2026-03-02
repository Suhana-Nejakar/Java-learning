
# 🧬 Java Inheritance — Complete Detailed Notes (From Scratch, Simple English)

> Beginner → Interview level | Real-time scenarios | Small project | Diagrams

---

# 📘 1. What is Inheritance?

Inheritance is one of the **4 pillars of OOP**:

- Encapsulation
- Abstraction
- Inheritance
- Polymorphism

## ✅ Definition (Very Simple)

Inheritance means:

👉 One class can use properties and methods of another class

### 🧠 One-line meaning:

**Inheritance = Child class gets features of Parent class**

---

# 🧠 2. Real-Life Examples

## 👨‍👩‍👦 Family

Child inherits:

- Surname
- Properties
- Features

from parents.

---

## 🚗 Vehicle Example

All vehicles have:

- speed
- fuel
- start()
- stop()

Car, Bike, Truck share these features.

Instead of writing again and again — use inheritance.

---

# 🎯 3. Why Inheritance is Needed

Without inheritance:

❌ Duplicate code  
❌ Hard maintenance  
❌ Large code  

With inheritance:

✅ Code reuse  
✅ Clean structure  
✅ Easy updates

---

# 🔧 4. How Inheritance Works in Java

Using keyword:

```
extends
```

---

# 🧩 5. Types of Inheritance in Java

## 1️⃣ Single Inheritance

One child from one parent

## 2️⃣ Multilevel Inheritance

Grandparent → Parent → Child

## 3️⃣ Hierarchical Inheritance

Multiple children from one parent

(Java does NOT support multiple inheritance with classes)

---

# 🏗️ 6. Basic Structure

```
Parent Class
   ▲
   |
Child Class
```

---

# 💻 7. Small Project — Employee System

## 🎯 Scenario

All employees share:

- name
- salary
- work()

Manager has additional role.

---

## 📦 Class Diagram

```
+--------------------+
|     Employee       |
+--------------------+
| name               |
| salary             |
+--------------------+
| work()             |
+--------------------+
          ▲
          |
   ----------------
   |
+---------+
| Manager |
+---------+
| manageTeam() |
+---------+
```

---

## 👨‍💻 Parent Class

```java
class Employee {

    String name;
    double salary;

    void work() {
        System.out.println("Employee working");
    }
}
```

---

## 👨‍💼 Child Class

```java
class Manager extends Employee {

    void manageTeam() {
        System.out.println("Manager managing team");
    }
}
```

---

## 🧪 Main Program

```java
public class Main {
    public static void main(String[] args) {

        Manager m = new Manager();

        m.name = "Ravi";
        m.salary = 50000;

        m.work();        // inherited
        m.manageTeam();  // own method
    }
}
```

---

# 🔍 8. Flow Diagram

```
Employee (Parent)
     |
     v
Manager (Child)
```

Child automatically gets parent features.

---

# 🏥 9. Real-Time Scenario — Hospital

Base class:

Doctor

Specialized doctors:

- Cardiologist
- Neurologist
- Dentist

All inherit common doctor features.

---

# 🏫 10. Real-Time Scenario — School

Base class:

Person

Derived:

- Student
- Teacher
- Staff

---

# 🚗 11. Real-Time Scenario — Vehicle

Base class:

Vehicle

Derived:

- Car
- Bike
- Truck

---

# ⚠️ 12. Access Modifiers in Inheritance

## Public

Accessible everywhere

## Protected

Accessible in child class

## Private

Not accessible in child class

---

# 🏆 13. Advantages of Inheritance

- Code reuse
- Saves time
- Improves readability
- Supports polymorphism

---

# 🎯 14. Interview Definition

Inheritance is:

> Mechanism where one class acquires properties and methods of another class.

---

# ❤️ 15. Final Super Simple Meaning

## Remember forever:

👉 Parent → Child  
👉 Reuse code  
👉 Avoid duplication  

## Formula:

```
Inheritance = extends keyword
```

---

# 🚀 16. Practice Mini Projects

Build using inheritance:

- Employee hierarchy system
- School management system
- Vehicle system
- Hospital system

---

# 🎉 END — You Now Understand Inheritance
