## Polymorphism

In case of overriding, which method is called depends on the type of the object.
```
Shapes circle=new Circle()

```
will call the circles method. 

### How overriding works ?
What it is being able to access is determined by the reference, 
and which one it is being able to determine, is defined by the object.

> If Shapes class does not have the area method, then calling `circle.area()` will give an error.

In summary, for method overriding to occur, both the method name and the parameter list (type and order) must be identical between the parent and child classes.
If they differ in any of these aspects, it results in method overloading, not method overriding.

### Using "final"

1. final methods can't be over-ridden.
2. If we make a class as final, their methods are automatically made as final.


### Difference between early binding and late binding

| Early-binding                            | Late-binding                         |
|------------------------------------------|--------------------------------------|
| It is a compile-time process             | It is a run-time process             |
| Method definition linked at compile time | Method definition linked at run time |
| Actual object not used for binding       | Actual object used for binding       |
| For example: Method overloading          | For example: Method overriding       |
| Program execution is faster              | Program execution is slower          |