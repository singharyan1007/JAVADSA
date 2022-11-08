package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ques {
    public static void main(String[] args) {
//        int[] arr=new int[5];
//        String[] ar=new String[5];
//        System.out.println(arr[0]);
//        System.out.println(ar[0]);
        //default value of empty String array is null. Null is not a datatype. It is a basic literal.
        //int num=null; will give an error.
        //You can assign null only to non-primitives like String name=null;
        //It is a special value which is assigned to reference types and it can be type casted to any type.

        // Looping over an array
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        //using directly the for-each loop
        for(int num : arr) { // for every element in array, print the element
           System.out.print(num + " "); //  here num represents element of the array
      }
        System.out.println(Arrays.toString(arr));
    }


}
