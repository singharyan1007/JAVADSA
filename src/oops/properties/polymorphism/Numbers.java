package oops.properties.polymorphism;

public class Numbers {
    void calculate(int a, int b){
        System.out.println(a+b);
    }
    int calculate(String b, int a){
        System.out.println(a+b);
        return a;

    }
    String calculate(int a, String b){
        System.out.println(a+b);
        return b;

        // Here you can see only the order of the parameters is changed
    }
}
