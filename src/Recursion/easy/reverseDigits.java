package Recursion.easy;

public class reverseDigits {

    static int sum=0;
    static void sumrev(int n){
        if(n==0)
            return;

        int rem=n%10;
        sum=sum*10+rem;
        sumrev(n/10);
    }
    public static void main(String[] args) {
        sumrev(1423);
        System.out.println(sum);
    }
}
