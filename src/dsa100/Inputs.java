package dsa100;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
       int[] arr={1,15,2,3};
       int sum=0;
       for(int i=0;i<arr.length;i++){
           int n=0;
           int s=0;
           if(arr[i]>10){
               n=arr[i]%10;
               s+=n;
               n=n/10;
               sum+=s;
           }
           sum+=arr[i];

       }
        System.out.println(sum);

    }
}
