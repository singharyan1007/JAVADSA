package binarysearch.searchinmatrix;

import java.util.Arrays;

public class basicsalgo {
    // here we have to reduce the row and column to get the target elemnt
    public static void main(String[] args) {
        //we will start searching from ROW ZERO and LAST COLUMN
        //if target == element return index
        //if target < col(element) col--
        //else row++
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target=37;
        int[] ans=matrix(arr, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] matrix(int[][] arr, int target){
        int r=0;
        int c=arr[0].length-1;//we take the length of the first row;
        while(r<arr.length && c>=0) {
            if (arr[r][c] == target)
                return new int[]{r, c};
            if (target<arr[r][c]){
                c--;
            }else{
                r++;
            }
        }
        return new int[] {-1,-1};
    }
}
