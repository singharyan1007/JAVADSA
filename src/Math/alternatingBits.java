package Math;

public class alternatingBits {
    public static void main(String[] args) {
        int n=5;
        bits(n);
    }
    static void bits(int n){
        int num=n;
        num=num>>1;
        System.out.println(Integer.toBinaryString(num));
//        System.out.println(n&(n+1));

        System.out.println(Integer.toBinaryString(n+1));
        System.out.println(Integer.toBinaryString(n&(n+1)));

        System.out.println(n^n+1);


    }
}
