# Object Cloning in Java

The object cloning is a way to create exact copy of an object. 
The `clone()` method of Object class is used to clone an object. 

In `java.lang` package there i an interface `Colneable` that must be implemented by the class whose object clone we want to create.

`clone()` method saves the extra processing task for creating the exact copy of an object.
If we perform it by using the new keyword, it will take a lot of processing time to be performed that is why we use object cloning. 
