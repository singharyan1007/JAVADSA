package oops.staticExample.Singleton;

public class Main {
    public static void main(String[] args) {
        Basic obj=Basic.getInstance();
        Basic obj2=Basic.getInstance();
        Basic obj3=Basic.getInstance();

        //All 3 refs are representing the same object

    }
}
