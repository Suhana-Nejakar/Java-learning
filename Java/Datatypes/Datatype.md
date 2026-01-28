# Java Data Types – From Basics to Advanced 📘

These notes are written in a **simple, exam + interview‑friendly** way with **real‑life scenarios and examples**, so you can easily remember and explain.

---

## 1. What is a Data Type?

A **data type** tells Java:

* what kind of data a variable can store
* how much memory is required
* what operations can be performed on it

📌 Example:

```java
int age = 22;
```

Here, `int` is the data type → it stores whole numbers.

---

## 2. Types of Data Types in Java

Java data types are divided into **two main categories**:

1. **Primitive Data Types** (Basic)
2. **Non‑Primitive Data Types** (Advanced / Reference)

---

# PART 1: PRIMITIVE DATA TYPES

Java has **8 primitive data types**.

| Type    | Size    | Example            |
| ------- | ------- | ------------------ |
| byte    | 1 byte  | small numbers      |
| short   | 2 bytes | medium numbers     |
| int     | 4 bytes | normal integers    |
| long    | 8 bytes | very large numbers |
| float   | 4 bytes | decimal values     |
| double  | 8 bytes | precise decimals   |
| char    | 2 bytes | single character   |
| boolean | 1 bit   | true / false       |

---

## 3. byte

* Stores **small whole numbers**
* Range: **-128 to 127**

### Example:

```java
byte temperature = 25;
```

### Real‑life Scenario:

✔ Temperature values, age of a child, battery percentage

---

## 4. short

* Stores **slightly bigger numbers than byte**

### Example:

```java
short totalStudents = 1500;
```

### Scenario:

✔ School student count

---

## 5. int (MOST USED)

* Default data type for integers

### Example:

```java
int salary = 25000;
```

### Scenario:

✔ Salary, marks, product price

---

## 6. long

* Used for **very large values**

### Example:

```java
long mobileNumber = 9876543210L;
```

### Scenario:

✔ Mobile numbers, Aadhaar numbers

---

## 7. float

* Used for **decimal values** (less precision)

### Example:

```java
float percentage = 78.5f;
```

### Scenario:

✔ Exam percentage

---

## 8. double (MOST USED for decimals)

* More precise than float

### Example:

```java
double bankBalance = 12345.75;
```

### Scenario:

✔ Bank balance, scientific calculations

---

## 9. char

* Stores **single character**

### Example:

```java
char grade = 'A';
```

### Scenario:

✔ Grades, gender (M/F)

---

## 10. boolean

* Stores only **true or false**

### Example:

```java
boolean isPlaced = false;
```

### Scenario:

✔ Login status, placement status

---

# PART 2: NON‑PRIMITIVE DATA TYPES (ADVANCED)

Non‑primitive data types:

* Store **multiple values or complex data**
* Created using **classes**
* Memory stored in **heap**

---

## 11. String

* Stores **sequence of characters**

### Example:

```java
String name = "Suhana";
```

### Scenario:

✔ Name, address, email ID

📌 String is a **class**, not primitive.

---

## 12. Array

* Stores **multiple values of same data type**

### Example:

```java
int marks[] = {70, 80, 90};
```

### Scenario:

✔ Marks of students, prices of products

---

## 13. Class

* Blueprint for creating objects

### Example:

```java
class Student {
    int id;
    String name;
}
```

### Scenario:

✔ Student, Employee, Car

---

## 14. Object

* Instance of a class

### Example:

```java
Student s1 = new Student();
s1.id = 101;
s1.name = "Anu";
```

---

## 15. Interface (Advanced Concept)

* Used to achieve **100% abstraction**

### Example:

```java
interface Bank {
    void withdraw();
}
```

### Scenario:

✔ ATM machine rules

---

## 16. Wrapper Classes (IMPORTANT FOR INTERVIEW)

| Primitive | Wrapper   |
| --------- | --------- |
| int       | Integer   |
| char      | Character |
| double    | Double    |
| boolean   | Boolean   |

### Example:

```java
Integer num = 10;
```

### Scenario:

✔ Collections (ArrayList, HashMap)

---

## 17. Type Casting

### Implicit (Automatic)

```java
int a = 10;
double b = a;
```

### Explicit (Manual)

```java
double x = 10.5;
int y = (int) x;
```

---

## 18. Primitive vs Non‑Primitive (Interview Question)

| Primitive            | Non‑Primitive         |
| -------------------- | --------------------- |
| Stores simple values | Stores complex values |
| Fixed size           | Dynamic size          |
| Faster               | Slower                |
| Cannot be null       | Can be null           |

---

## 19. Real‑Time Mini Scenario (Final)

```java
class Employee {
    int id;          // primitive
    String name;     // non‑primitive
    double salary;   // primitive
    boolean isActive;// primitive
}
```

✔ Used in **real company applications**

---

## 20. Quick Memory Tip 🧠

* **Numbers → int / double**
* **Text → String**
* **Yes / No → boolean**
* **Multiple values → Array**

---

✅ If you want:

* Interview questions
* Practice programs
* MCQs
* PDF format

Just tell me 💙


Got you, Suhana 💙
Let’s make this **hands-on and practical**, step by step — no theory overload, only **real coding practice**.
I’ll give you **tasks + examples + what you should observe** 👇

---

# ✅ JAVA DATA TYPES – PRACTICAL PROGRAMS

## 🟢 LEVEL 1: BASIC PRACTICE (Must Do)

### 1️⃣ Store & Print All Primitive Data Types

**Concept:** byte, short, int, long, float, double, char, boolean

```java
class PrimitiveDemo {
    public static void main(String[] args) {

        byte age = 22;
        short students = 1200;
        int salary = 25000;
        long mobile = 9876543210L;
        float percentage = 78.5f;
        double balance = 12345.75;
        char grade = 'A';
        boolean isPlaced = false;

        System.out.println(age);
        System.out.println(students);
        System.out.println(salary);
        System.out.println(mobile);
        System.out.println(percentage);
        System.out.println(balance);
        System.out.println(grade);
        System.out.println(isPlaced);
    }
}
```

👉 **Practice:**
Change values & run again.

---

### 2️⃣ Student Details (Real-Life Scenario)

**Concept:** primitive + String

```java
class Student {
    public static void main(String[] args) {

        int id = 101;
        String name = "Suhana";
        double marks = 85.5;
        boolean passed = true;

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Passed: " + passed);
    }
}
```

✔️ This is **very common interview style program**

---

## 🟡 LEVEL 2: ARRAY PRACTICE

### 3️⃣ Store & Print Marks Using Array

**Concept:** Array

```java
class ArrayDemo {
    public static void main(String[] args) {

        int marks[] = {70, 80, 90, 85};

        for(int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
```

👉 **Try:**

* Change values
* Print only marks > 80

---

### 4️⃣ Find Maximum Value in Array

**Concept:** int + array logic

```java
class MaxValue {
    public static void main(String[] args) {

        int numbers[] = {10, 45, 32, 60, 25};
        int max = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum value is: " + max);
    }
}
```

📌 **Interview favorite**

---

## 🟠 LEVEL 3: TYPE CASTING (IMPORTANT)

### 5️⃣ Implicit Type Casting

```java
class ImplicitCasting {
    public static void main(String[] args) {

        int a = 10;
        double b = a;

        System.out.println(a);
        System.out.println(b);
    }
}
```

✔️ Java automatically converts int → double

---

### 6️⃣ Explicit Type Casting

```java
class ExplicitCasting {
    public static void main(String[] args) {

        double x = 10.8;
        int y = (int) x;

        System.out.println(x);
        System.out.println(y);
    }
}
```

👉 Observe: **decimal part is lost**

---

## 🔵 LEVEL 4: CLASS & OBJECT (REAL APPLICATION)

### 7️⃣ Employee Example

**Concept:** class, object, primitive + non-primitive

```java
class Employee {
    int id;
    String name;
    double salary;

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.id = 201;
        e1.name = "Ravi";
        e1.salary = 30000;

        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e1.salary);
    }
}
```

✔️ This is **real company-level structure**

---

## 🔴 LEVEL 5: WRAPPER CLASS PRACTICE

### 8️⃣ Primitive → Wrapper

```java
class WrapperDemo {
    public static void main(String[] args) {

        int a = 10;
        Integer obj = a;   // auto-boxing

        System.out.println(obj);
    }
}
```

👉 Used in **ArrayList, Collections**

---

## ⭐ MINI TASKS FOR YOU (DO THESE 👇)

Try these **yourself**:

1️⃣ Create a `Car` class
→ carName (String)
→ price (int)
→ isAvailable (boolean)

2️⃣ Store **5 mobile prices** in an array and print them

3️⃣ Convert `double marks = 89.7` to `int`

4️⃣ Find **minimum value** in an array

---

💬 **Next step?**
I can:

* check your code
* give **daily practice plan**
* provide **interview coding questions**
* explain any program line-by-line

Just tell me which one you want 🌱
