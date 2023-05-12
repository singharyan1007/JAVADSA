package Recursion;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(3));

    }
    static int fibonacci(int n){
        //Base Condition
        if(n==0){
            return n;
        }if(n<=2){
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2)+fibonacci(n-3);
    }
}
