package Math;

public class PowerOf4 {
    public static void main(String[] args) {
        //for power of two
//        System.out.println(power(536870912));
//        System.out.println(p(536870912));
        System.out.println(po(536870912));


    }
    static boolean power(int n){
       long x=1;
       while(x<n){
           x<<=2;
           System.out.println(x);
       }
       if(x==n)
           return true;

       return false;


    }
    static int p(int n){
        int ans=n&(n-1);
        int count=0;

        if(ans==0 & n>0){
            while(n>1){
                n>>=1;
                System.out.println(n);
                count++;

            }
            return (count % 2 == 0) ? 1 : 0;

        }
        return 0;

    }
    static boolean po(int n){
        double a=Math.floor(Math.log(n)/Math.log(4));
        double b=Math.ceil(Math.log(n)/Math.log(4));
        return a==b;

    }
}
