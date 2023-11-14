package oops.properties.polymorphism;

public class Animals {
    void makeSound(){
        System.out.println("I make sound");
    }

    public static void main(String[] args) {
        Dog dg=new Dog();
        dg.makeSound();

        Cat ct=new Cat();
        ct.makeSound();
    }
}

class Dog extends Animals{
    @Override
    void makeSound(){
        System.out.println("I bark");
    }
}

class Cat extends Animals{
    @Override
    void makeSound(){
        System.out.println("I meow");
    }
}
