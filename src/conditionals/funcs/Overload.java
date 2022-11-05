package conditionals.funcs;

public class Overload {
    public static void main(String[] args) {
        int add1=sum(20,60,20);
        //recgnition of the function is done during the compile time
        System.out.println(add1);
        int add2=sum(90,80);
        System.out.println(add2);
        //sum()-without parameters will get an error becoz cant decide which to select
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    };
    static int sum(int a,int b){
        return a+b;
    }
}
