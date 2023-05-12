package arrays;

import java.util.Arrays;

public class RotatingAnArray {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6 };
        right(arr,3,6);
        System.out.println(Arrays.toString(arr));

    }
    static void right(int arr[], int K, int N)
    {
        reverse(arr, 0, N - K);
         reverse(arr, N - K, N);
         reverse(arr, 0, N);

    }
    static int[] reverse(int arr[], int start, int end)
    {
        int temp;
        int size = end - start;

        // Reversal based on pointer approach
        for (int i = 0; i < (size / 2); i++) {
            temp = arr[ i + start];
            arr[i + start] = arr[start + size - i - 1];
            arr[start + size - i - 1] = temp;
        }
        return arr;
    }


}
