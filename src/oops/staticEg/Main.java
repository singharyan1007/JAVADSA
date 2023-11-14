package oops.staticEg;

public class Main {
    public static void main(String[] args) {
//        Human aryan=new Human("Aryan",23,33000,false);
//        Human vanshika=new Human("Vanshika",23,100000,false);
//        System.out.println(vanshika.population);
//        System.out.println(aryan.population);  will also work

//        System.out.println(Human.population);
        // but using the static variables with class name is the convention



    fun();
    }
    static void fun(){
 //        greeting();   will give an error because accessing non-static object from static object;
        Main obj=new Main();
        obj.greeting();
    }
    void greeting(){
        System.out.println("Hello Friend");
    }
}
