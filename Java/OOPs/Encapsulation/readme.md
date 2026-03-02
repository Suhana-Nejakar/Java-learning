
# 🔐 Java Encapsulation — Complete Detailed Notes (From Scratch, Simple English)

> Designed for beginners, interview preparation, and teaching (real‑time scenarios + mini project)

---

# 📘 1. What is Encapsulation?

Encapsulation is one of the **4 pillars of OOP**:

- Encapsulation
- Abstraction
- Inheritance
- Polymorphism

## ✅ Definition (Very Simple)

Encapsulation means:

👉 Wrapping data (variables) and methods (functions) into a single unit (class)  
👉 Hiding the internal data from outside world  
👉 Allowing access only through controlled methods

### 🧠 One‑line meaning:

**Encapsulation = Data Hiding + Controlled Access**

---

# 🧠 2. Why Encapsulation Exists?

Imagine if anyone could change important data in your program:

❌ Bank balance can become negative  
❌ Student marks can be changed randomly  
❌ Medical data can be corrupted  

So we protect data.

---

# 🏦 3. Real‑World Example — Bank Account

## Without Encapsulation

Anyone can do:

```
account.balance = -100000;
```

This is dangerous ❌

## With Encapsulation

Balance is hidden.

User must use:

- deposit()
- withdraw()
- checkBalance()

System checks rules ✔

---

# 🔧 4. How Encapsulation is Achieved in Java

## STEP 1 — Make variables PRIVATE

Private = cannot access directly outside class

## STEP 2 — Provide PUBLIC methods

Public methods = controlled access

Usually:

- Getter → Read data
- Setter → Modify data

---

# 📦 5. Structure of Encapsulation

```
Class
 ├── Private Variables (Hidden Data)
 └── Public Methods (Access Control)
```

---

# 🧩 6. Class Diagram

```
+--------------------------------+
|        BankAccount             |
+--------------------------------+
| - accountNumber : String       |
| - balance : double             |
+--------------------------------+
| + deposit(amount)              |
| + withdraw(amount)             |
| + getBalance()                 |
| + getAccountNumber()           |
+--------------------------------+
```

- "-" → private
- "+" → public

---

# 💻 7. Small Project — Banking System

## 🎯 Scenario

Build a Bank Account where:

- Balance cannot be accessed directly
- Withdraw only if balance is sufficient
- Deposit only positive amount

---

## 👨‍💻 Code — BankAccount.java

```java
class BankAccount {

    // Private data (hidden)
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accNo, double initialBalance) {
        accountNumber = accNo;

        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            balance = 0;
        }
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else if (amount > 0) {
            balance -= amount;
            System.out.println(amount + " withdrawn");
        } else {
            System.out.println("Invalid withdraw amount");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }
}
```

---

## 🧪 Main Program

```java
public class Main {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("ACC123", 1000);

        acc.deposit(500);
        acc.withdraw(200);

        System.out.println("Balance: " + acc.getBalance());

        // ❌ Not allowed:
        // acc.balance = 100000;
    }
}
```

---

# 🔍 8. Flow Diagram

```
User
  |
  v
Public Methods (deposit, withdraw)
  |
  v
Private Variables (balance)
```

User never touches data directly.

---

# 🧠 9. Getter and Setter Deep Explanation

## Getter

Used to READ private data

```
public double getBalance() {
    return balance;
}
```

## Setter

Used to MODIFY private data safely

```
public void setBalance(double amount) {
    if(amount >= 0) {
        balance = amount;
    }
}
```

---

# 🏥 10. Real‑Time Scenario — Hospital System

Patient Data:

- Name
- Age
- Disease history

Sensitive data must be protected.

Only authorized methods can change it.

Encapsulation protects patient privacy.

---

# 🏫 11. Real‑Time Scenario — Student System

Marks should not be changed randomly.

Teacher uses method:

```
updateMarks(studentId, newMarks)
```

System validates ✔

---

# 🚗 12. Real‑Time Scenario — Car System

Car speed cannot be directly changed.

Use:

- accelerate()
- brake()

System ensures safe speed.

---

# ⚠️ 13. Without Encapsulation Problems

- Data corruption
- Security issues
- Uncontrolled changes
- Hard debugging

---

# 🏆 14. Advantages of Encapsulation

## 🔒 Security

Sensitive data protected

## 🛠 Control

You control how data changes

## 🔄 Flexibility

Internal implementation can change

## 🧪 Easy Testing

Less bugs

---

# 🎯 15. Interview Definition

Encapsulation is:

> Binding data and methods together into a single unit and restricting direct access to the data.

---

# ❤️ 16. Final Super Simple Meaning

## Remember this forever:

👉 Hide data  
👉 Protect data  
👉 Control access  

## Formula:

```
Encapsulation = private variables + public methods
```

---

# 🚀 17. When Interviewer Asks

Say:

“Encapsulation is the mechanism of wrapping data and methods together and restricting direct access using private variables and public getter/setter methods.”

---

# ⭐ 18. You Should Practice

Try building:

- Student Management System
- ATM System
- Employee System

All using encapsulation

---

# 🎉 END — You Now Understand Encapsulation
