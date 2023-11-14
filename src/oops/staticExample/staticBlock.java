package oops.staticExample;

public class staticBlock {
    static int a=90;
    static int b=69;

    static{

//        System.out.println("Fuck u !!!!!!!!!!!!!!!!!!!!!!!!!!");
//        for(int i=0;i<19;i++){
//            System.out.print(b);
//        }
//        System.out.println();
        System.out.println("I am in static block");

    }

    public static void main(String[] args) {
        System.out.println("Yamete Kudasaiiiiiiiiiiiiiii !!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//        staticBlock obj=new staticBlock();
        staticBlock.b+=3;
        System.out.println(staticBlock.a+" "+staticBlock.b);
//        staticBlock obj2=new staticBlock();
        System.out.println(staticBlock.a+" "+staticBlock.b);
    }
}
