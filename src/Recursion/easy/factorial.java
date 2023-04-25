package Recursion.easy;

public class factorial {
    public static void main(String[] args) {

        System.out.println(fact(4));

    }
    static int fact(int n){
        if(n==1){return n;}
        return n*fact(n-1);
    }
}
