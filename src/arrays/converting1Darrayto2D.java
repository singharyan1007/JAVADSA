package arrays;

public class converting1Darrayto2D {
    public static void main(String[] args) {

    }
    static int[][] sol(int[] original,int m,int n){
        int len=original.length;

        int[][] res=new int[m][n];
        if(m*n!=len){
            return new int[0][0];
        }
        int new_c=0;

        //We need to enter the elements row wise
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j]=original[new_c];
                new_c++;

            }
        }
        return res;
    }

}
