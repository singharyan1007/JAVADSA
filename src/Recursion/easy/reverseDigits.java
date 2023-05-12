package Recursion.easy;

public class reverseDigits {

    static int sum=0;
    static int sumrev(int n){
        if(n==0)
            return 0;

        int rem=n%10;
        sum=sum*10+rem;
       return sumrev(n/10);
    }
    public static void main(String[] args) {
        int a=sumrev(1423);
        if(a==1423){
            System.out.println(1);
        }
        System.out.println(sum);
    }
}
