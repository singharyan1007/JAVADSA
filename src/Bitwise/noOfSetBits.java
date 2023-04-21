package Bitwise;

public class noOfSetBits {
    public static void main(String[] args) {
        int n=4;
        System.out.println(n);
        int count=0;
        while(n>0){
            n=n-(n&(-n));
            count++;

        }
        System.out.println(count);
    }
}
