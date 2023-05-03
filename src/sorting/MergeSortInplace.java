package sorting;

import java.util.Arrays;

public class MergeSortInplace {
    public static void main(String[] args) {
        int[] arr={8,4,1,3,2,5};
        mergesortinplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static void mergesortinplace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int mid = (s + e) / 2;

        mergesortinplace(arr, s, mid);
        mergesortinplace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }


}