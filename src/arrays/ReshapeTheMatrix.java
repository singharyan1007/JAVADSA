package arrays;

import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] arr={
                {1,2},
                {3,4}
        };
        System.out.println(Arrays.toString(matrixReshape(arr,1,4)));

    }
    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(m*n!=r*c ){
            return mat;
        }
        int[][] res=new int[r][c];
        int new_r=0;
        int new_c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[new_r][new_c]=mat[i][j];
                new_c++;
                if(new_c==c){
                    new_c=0;
                    new_r=0;
                }
            }
        }
        return res;
    }
}
