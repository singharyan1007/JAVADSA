package conditionals.funcs;

public class Swap {
    public static void main(String[] args) {
        int a =10;
        int b=20;
        swp(a,b);


    }
    static void swp(int a,int b){
        int swap=a;
        a=b;
        b=swap;
        System.out.println(a + " " + b);
    }
}
