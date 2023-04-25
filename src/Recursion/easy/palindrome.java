package Recursion.easy;

public class palindrome {
    public static void main(String[] args) {
        int n=1223;
        int r=rev(n);
        if(r==n)
            System.out.println("Palindrome");
        else System.out.println("Not");
    }
    static int rev(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    static int helper(int n, int digits){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
}
