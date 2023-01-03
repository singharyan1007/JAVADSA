package sorting;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr={};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            //what we are doing here is finding out the max number in the array and swapping it with the last or required index
            int last=arr.length-i-1;
            int maxnumber=maxnum(arr,0,last);

            swap(arr, maxnumber,last);

        }
    }
    static int maxnum(int[] arr, int start,int last){
        int max=start;
        for(int i=start;i<last;i++){
            if(arr[max]<arr[i])
                max=i;
        }
        return max;

    }
    static void swap(int[] arr, int start, int last){
        int temp=arr[start];
        arr[start]=arr[last];
        arr[last]=temp;
    }
}
