package sorting;

import java.util.Arrays;

public class  insertionsort {
    public static void main(String[] args) {
        int[] arr={4,5,3,1,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            //outer loop should run from 0 to N-2;
            //we take N-2 because in other case it go out of bound
            for(int j=i+1;j>0;j--){
                //used for comparing the left hand side values

                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else
                    break;
            }
        }
    }

    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
