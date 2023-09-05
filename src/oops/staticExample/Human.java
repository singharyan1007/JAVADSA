package oops.staticExample;

public class Human {
    int age;
    int salary;
    boolean married;
    String name;

    static int population;



    Human(int age,int salary,boolean married,String name){
        this.age=age;
        this.salary=salary;
        this.married=married;
        this.name=name;

        Human.population+=1;
    }
}
