package Bitwise;

public class Magicnumber {
    public static void main(String[] args) {
        int base=5;
        int last=0;
        int n=6;
        int ans=0;

        while(n>0){
          last=n&1;
          n=n>>1;
          ans+=last*base;
          base=base*5;
          //complexity is log(n)
        }
        System.out.println(ans);
    }
}
