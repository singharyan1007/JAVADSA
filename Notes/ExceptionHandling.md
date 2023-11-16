# Errors vs Exceptions

### Exceptions:

1.    Exceptions are events that occur during the execution of a program that disrupt the normal flow of the program's instructions.
 2.   They are typically caused by the code itself, such as invalid input, attempting to perform an operation that's not allowed, or encountering unexpected conditions.

### Errors
1. Errors, on the other hand, are typically unrecoverable problems that occur at runtime and are caused by factors beyond the control of the program.
2. Cannot be handled by a programmer.

# Types of Exceptions

Built-in Exceptions
       1. Checked Exception
       2.  Unchecked Exception 
User-Defined Exceptions

### Built-in exceptions
1. Checked - Checked by the compiler at compile time 
2. Unchecked - Not checked by the compiler at the compile time

### What do you mean by **Throwing an Exception** ?

Means creating the Exception Object and handling it to the Runtime Environment(JVM).
The exception object basically contain name and description of the exception and the current state of the program where the exception has occurred.


### `throws` vs  `throw`

1. `throw` is a keyword used to explicitly throw an exception within a method or a block of code.
2. When you use throw, you're creating an instance of an exception object and causing the program's flow to transfer to the nearest suitable catch block in the call stack.
```
public void someMethod(int value) {
    if (value < 0) {
        throw new IllegalArgumentException("Value cannot be negative");
    }
    // Rest of the method logic
}

```

1. throws is a keyword used in method declarations to indicate that a particular method might throw certain types of exceptions during its execution.

```

public void someMethod() throws IOException {
    // Method logic that might cause an IOException
}

```