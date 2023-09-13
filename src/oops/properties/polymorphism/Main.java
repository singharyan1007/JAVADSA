package oops.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        Circle c=new Circle();
        Shapes square=new Square();

        c.area();
        square.area();
    }

}
