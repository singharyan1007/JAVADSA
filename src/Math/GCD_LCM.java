package Math;

public class GCD_LCM {
    public static void main(String[] args) {
        int a=4,b=8;
        System.out.println(gcd(a,b));
        int lcm=a*b/gcd(a,b);
        System.out.println(lcm);
    }
    static int gcd(int a, int b){
        if(a==0)
            return b;

        return gcd(b%a,a);
    }

}
