package conditionals.sw;

import java.util.Scanner;

public class newSwitch {
    public static void main(String[] args) {
   int sum=0;
   int n=371;
   int temp=n;
        while(n>0){
            int ch=n%10;
            sum+=(ch*ch*ch);
            n=n/10; ;

        }
        if(sum==n)
            System.out.println("Yes");
        else  System.out.println("No");


    }

}
