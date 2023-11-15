### Abstraction Vs Encapsulation

| Feature            | Encapsulation                | Abstraction                           |
|--------------------|------------------------------|---------------------------------------|
| **Definition**     | Bundling data and methods    | Hides unnecessary details             |
| **Scope**          | At the implementation level  | At the design level                   |
| **Purpose**        | Modular code organization    | Managing complexity in design         |
| **Implementation** | Using access modifiers       | Using abstract classes and interfaces |
| **Example**        | Class with private variables | Abstract class with interfaces        |
| **Focus**          | Implementation details       | Essential system features             |
| **Benefits**       | Code organization, security  | Simplified design, modularity         |
| **Usage**          | Within a class or object     | Throughout the design                 |


# Example
___
### Abstraction
We have a `System.out.println()` method to print anything. The `println()` method first checks whether the class has a `toString()` method or not.
If it does then overrides the default `toString()` method, else uses the default `toString()` method from the `Objects` class.
So here we only know that `println()` method prints, but we don't generally know the internal implementations.

### Encapsulation
Bundling the data and the methods which work on that data into a **single entity**.  

```java
public class Student {
    private String name;
    private int age;
    private String studentId;

    // Constructor to initialize the object
    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    // Public method to get the student's name
    public String getName() {
        return name;
    }

    // Public method to get the student's age
    public int getAge() {
        return age;
    }

    // Public method to get the student's ID
    public String getStudentId() {
        return studentId;
    }

    // Public method to set the student's age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age.");
        }
    }
}
```

In this example, the Student class encapsulates the data (name, age, and studentId) and provides public methods to access and modify that data.


### Data Hiding

Data hiding involves restricting the access to certain details of a class, typically by making data members private.

```java
public class BankAccount {
    private double balance; // Private variable, hidden from outside the class

    // Public method to access the balance
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

```

The balance field is made private, and we use public methods to access it.


