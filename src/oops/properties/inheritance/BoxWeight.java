package oops.properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        this.weight=-1;

    }
//    @Override
    public static void greeting(){
        System.out.println("Hey I am BoxWeight class");
    }

    BoxWeight(BoxWeight other){
        super(other);
        this.weight=other.weight;
    }
    BoxWeight(double side, double weight ){
        super(side);
        this.weight=weight;
    }
    BoxWeight(double l,double w,double h,double weight){
        super(l,w,h);
        this.weight=weight;
    }
}
