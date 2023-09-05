package oops.staticExample;
  class Test{
   static String name;
    public Test(String name){
        Test.name=name;
    }
}
public class InnerClasses {


    public static void main(String[] args) {
        Test a=new Test("Aryan");
        Test b=new Test("Vanshika");
        System.out.println(a.name);
        System.out.println(b.name);

        // Why it prints Vanshika both times because name is static and so the value becomes same for all the instances
        // because static variables are independent of the objects


        // Why main can access Test ??  By creating an object of the non-static class and referencing it.
    }
}
