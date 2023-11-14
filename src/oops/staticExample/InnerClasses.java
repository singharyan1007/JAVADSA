package oops.staticExample;
  class Test{
   static String name;
    public Test(String name){
        Test.name=name;
    }
}
public class InnerClasses {
      class Name{
          String naam;
          Name(String name){
              this.naam=name;

          }
      }


    public static void main(String[] args) {
//          Name obj=new Name("Aryan");
        Test a=new Test("Aryan");
        Test b=new Test("Vanshika");
        System.out.println(a.name);
        System.out.println(b.name);

        // Why it prints Vanshika both times
        // because name is static and so the value becomes same for all the instances
        // because static variables are independent of the objects


        // Why main can access Test ??  By creating an object of the non-static class and referencing it.
        //But cant access Name ?? Because Name is declared within InnerClasses, so it is dependent on InnerClasses.
    }
}
