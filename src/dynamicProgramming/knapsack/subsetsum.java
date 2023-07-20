package dynamicProgramming.knapsack;

import java.util.Arrays;

public class subsetsum {
    public static void main(String[] args) {
        int[] arr={3, 34, 4, 12, 5, 0};
        int sum=6;
        int n=arr.length;
        System.out.println(knap(arr,sum,n));


    }
    static boolean[][] t=new boolean[7][7];
    static  boolean knap(int[] arr, int sum, int n){
        for(int row=0;row<t.length;row++){
            for(int col=0;col<t[0].length;col++) {
                if (row == 0) {
                    t[row][col] = false;
                }
                if (col == 0) {
                    t[row][col] = true;
                }
            }
        }



        for(int i=1;i<t.length;i++ ){
            for(int j=1;j<t[0].length;j++){
                if(arr[i-1]<=j){
                    t[i][j]=t[i-1][j]||t[i-1][j-arr[i-1]];
                }else{
                    t[i][j]=t[i-1][j];

                }
            }
        }
        System.out.println(t[n][sum]);

        return t[n][sum];

    }





}
