package Bitwise;

public class NoOfDigits {
    public static void main(String[] args) {
        //calculating the number of digits in base b of binary representation of number n
        int n=10;
        int b=2;
        int res=(int)(Math.log(n)/Math.log(b))-1;
        System.out.println(res);

    }
}
