package oops.properties.inheritance;

public class Box {
     double l;
    double h;
    double w;


    static void greeting(){
        System.out.println("In Box Class !!!!");
    }


    Box(){
//        super();
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }

    Box(double side){
        this.w=side;
        this.l=side;
        this.h=side;
    }

    Box(double l, double h, double w) {
        System.out.println("Box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        //takes in a new Box object
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }

}
