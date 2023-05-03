package recursionPatterns;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,0,2,1,1,0};
        selection(arr,6,0,0);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int[] arr, int r, int c, int max){
        if(r==0){
            return;
        }
        if(c<r){
            //Here we are traversing the array to find the max element
            if(arr[c]>arr[max]){
                selection(arr, r, c+1,c);
            }else{
                selection(arr,r,c+1,max);
            }
            //Now when we come out of the loop its because we have completely traversed the array
            //means c>=r, so now we swap with the last element
        }else{
            int temp=arr[r-1];
            arr[r-1]=arr[max];
            arr[max]=temp;
            selection(arr, r-1,0,0);
        }
    }
}
