package oops.access;

public class SubClass extends A{


    public SubClass(int num,String name){
        super(num,name);
    }

    public static void main(String[] args) {
        SubClass obj=new SubClass(69,"Ar");
        int n=obj.num;

        //Only subclasses can access the protected attributes of a parent class

        // In different packages also only the subclass can access the protected attributes of a parent class
    }
}
