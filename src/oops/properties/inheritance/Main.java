package oops.properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        BoxWeight b=new BoxWeight();
//        BoxWeight.greeting();
//        System.out.println(b.h+" "+b.weight);

//        BoxWeight bt=new BoxWeight(4.6,8.9,9.0,87.9);
//        System.out.println(bt.w+" "+bt.l+" "+bt.h+" "+bt.weight);
        BoxPrice bs=new BoxPrice(2,32,4,69,69);
        System.out.println(bs.l+" "+bs.cost);

        //Child class or a subclass is able to access the properties of parent class,
        // but a parent class can't access the properties of child class
        // Box bx=new Box();
//        System.out.println(Box.weight);  is not possible

        // --------------------------------------------------------------------
        Box bt=new BoxWeight(2,3,4,6);
        System.out.println(bt.w);
//        System.out.println(bt.weight);  gives an error

        //---------------------------------------------------------------------
      //  BoxWeight wt=new Box(2,3,4);  throws an error. Refer notes



    }
}
