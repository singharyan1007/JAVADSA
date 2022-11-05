package conditionals.funcs;

import java.util.Scanner;

public class armstrong {
    //153=(1^3)+(5^3)+(3^3)
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
        System.out.println(armst(num));
    for(int i=100;i<1000;i++){
        if(armst(i)){
            System.out.println(i);
        }
    }
    }
    static boolean armst(int n){
        int m = 0;
        int original=n;
        while(n>0){
           int temp=n%10;
            n=n/10;
            m+=(temp*temp*temp);

        }
   return m == original;
    }

}
