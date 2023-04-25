package Recursion.easy;

public class basic {
    public static void main(String[] args) {
        int n=10;
        func(n);
        funcRev(n);

    }
    static void func(int n){
        if(n==0)return;
        System.out.println(n);
        func(n-1);
    }
    static void funcRev(int n){
        if(n==0)return;

        funcRev(n-1);
        System.out.println(n);
        //This prints the number when the function is removed from the stack. Or in Layman terms when the function returns to the place where it was called
    }

}
