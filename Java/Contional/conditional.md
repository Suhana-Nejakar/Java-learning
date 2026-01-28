# Java Conditional Statements – Concepts & Practicals 🚦

Conditional statements help Java **make decisions** based on conditions.

👉 Real life idea: *If it rains → take umbrella, else → no umbrella*

---

## 1. Types of Conditional Statements in Java

1. if statement
2. if–else statement
3. if–else–if ladder
4. nested if
5. switch statement

---

## 2. if Statement

### Concept

* Executes code **only if condition is true**

### Syntax

```java
if(condition) {
    // code
}
```

### Example

```java
class IfDemo {
    public static void main(String[] args) {
        int age = 20;

        if(age >= 18) {
            System.out.println("Eligible to vote");
        }
    }
}
```

### Real-Life Scenario

✔ Check voting eligibility

---

## 3. if–else Statement

### Concept

* Executes one block if condition is true
* Executes else block if condition is false

### Syntax

```java
if(condition) {
    // true block
} else {
    // false block
}
```

### Example

```java
class IfElseDemo {
    public static void main(String[] args) {
        int marks = 45;

        if(marks >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
```

### Scenario

✔ Exam result

---

## 4. if–else–if Ladder

### Concept

* Used when **multiple conditions** are checked

### Example (Grade System)

```java
class GradeDemo {
    public static void main(String[] args) {
        int marks = 82;

        if(marks >= 85) {
            System.out.println("Grade A");
        } else if(marks >= 70) {
            System.out.println("Grade B");
        } else if(marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }
}
```

### Scenario

✔ College grading system

---

## 5. Nested if Statement

### Concept

* One if inside another if

### Example

```java
class NestedIfDemo {
    public static void main(String[] args) {
        int age = 22;
        boolean hasVoterId = true;

        if(age >= 18) {
            if(hasVoterId) {
                System.out.println("You can vote");
            } else {
                System.out.println("Voter ID required");
            }
        } else {
            System.out.println("Not eligible to vote");
        }
    }
}
```

### Scenario

✔ Age + document verification

---

## 6. switch Statement

### Concept

* Used when **multiple fixed values** are checked
* Better alternative to long if–else

### Syntax

```java
switch(variable) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code
}
```

### Example

```java
class SwitchDemo {
    public static void main(String[] args) {
        int day = 3;

        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
```

### Scenario

✔ Menu selection, days, options

---

# PRACTICAL PROGRAMS (IMPORTANT)

## 7. Check Even or Odd

```java
class EvenOdd {
    public static void main(String[] args) {
        int num = 7;

        if(num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
```

---

## 8. Positive, Negative or Zero

```java
class NumberCheck {
    public static void main(String[] args) {
        int num = -5;

        if(num > 0) {
            System.out.println("Positive");
        } else if(num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
```

---

## 9. Simple Login Validation

```java
class LoginDemo {
    public static void main(String[] args) {
        String username = "admin";
        String password = "1234";

        if(username.equals("admin") && password.equals("1234")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Credentials");
        }
    }
}
```

✔ Very important **real-time example**

---

## 10. Mini Tasks for Practice 📝

Try these yourself:

1️⃣ Check largest of **two numbers** using if–else

2️⃣ Check largest of **three numbers** using if–else–if

3️⃣ Electricity bill:

* units < 100 → low bill
* units 100–300 → medium bill
* units > 300 → high bill

4️⃣ Use switch to create **simple calculator** (add, sub, mul)

---

## 11. Interview Tips ⭐

* Use **if–else** for conditions
* Use **switch** for fixed options
* Avoid deep nesting (clean code)

---

✅ Next concepts you can learn:

* Loops (for, while, do-while)
* Pattern programs
* Break & continue
* Real interview questions

Tell me what you want next 🌱
