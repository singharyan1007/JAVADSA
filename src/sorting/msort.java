package sorting;

import java.util.Arrays;

public class msort {
    public static void main(String[] args) {
        int[] arr={4 ,1 ,3, 9 ,7};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }
   static void merge(int arr[], int l, int m, int r)
    {
        // Your code here
        int[] mix=new int[r-l];

        int i=l;
        int j=m;
        int k=0;
        while(i<m && j<r){
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        //Conditions of left out arrays
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < r) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int x=0;x<mix.length;x++){
            arr[l+x]=mix[x];
        }
    }
   static void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(r-l==1){
            return;
        }
        int m=l+(r-l)/2;

        mergeSort(arr,l,m);
        mergeSort(arr,m,r);
        merge(arr,l,m,r);
    }
}
