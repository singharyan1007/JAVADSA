package Recursion.easy;

public class sumofDigits {
    public static void main(String[] args) {
        int n=12345;
        System.out.println(sum(n));
    }
    static int sum(int n){
        if(n==0)return 0;
        return sum(n/10)+(n%10);
    }
}
