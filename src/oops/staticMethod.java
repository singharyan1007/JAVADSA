package oops;

public class staticMethod {
    int instanceVariable=25;
    static void myClass(){
        staticMethod myObj=new staticMethod();

        System.out.println(myObj.instanceVariable);
        //way to access a non-static variable in a static method is to create an object reference
    }



    public static void main(String[] args) {

    }
}
