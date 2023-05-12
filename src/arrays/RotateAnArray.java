package arrays;

import java.util.Arrays;

public class RotateAnArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        rotateArr(arr,2,5);
        System.out.println(Arrays.toString(arr));
    }
    static void rotateArr(int arr[], int d, int n)
    {
        d=d%n;
        reverse(arr,0,n-1);
        reverse(arr,0,n-d-1);
        reverse(arr,n-d,n-1);
    }
    static void reverse(int[] arr, int s, int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
