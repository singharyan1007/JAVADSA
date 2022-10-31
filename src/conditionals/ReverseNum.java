package conditionals;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int nw=0;
        int n=in.nextInt();
        while(n>0){
            int rem=n%10;
            nw=(nw*10)+rem;
            n=n/10;
        }
        System.out.println(nw);
    }


}
