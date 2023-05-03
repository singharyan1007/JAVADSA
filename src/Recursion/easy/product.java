package Recursion.easy;

public class product {
    public static void main(String[] args) {
        int n=1234;
        System.out.println(pro(n));
    }
    static int pro(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*pro(n/10);
    }
}
