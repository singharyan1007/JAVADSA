package Recursion;

public class Basic {
    public static void main(String[] args) {
        recurse(1);
    }
    static void recurse(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        recurse(n+1);
    }
}
