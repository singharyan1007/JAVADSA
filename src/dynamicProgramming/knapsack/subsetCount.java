package dynamicProgramming.knapsack;

public class subsetCount {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,8,10};
        int sum=1;
        System.out.println(subcount(arr,sum,arr.length));
    }
    static int subcount(int[] arr, int sum, int n){
        int[][] t=new int[n+1][sum+1];
        for(int row=0;row<t.length;row++){
            for(int col=0;col<t[0].length;col++) {
                if (row == 0) {
                    t[row][col] = 0;
                }
                if (col == 0) {
                    t[row][col] = 1;
                }
            }
        }

        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                if(arr[i-1]<=j){
                    t[i][j]=t[i-1][j]+t[i-1][j-arr[i-1]];
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }

        return t[n][sum];
    }
}
