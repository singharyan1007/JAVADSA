package dynamicProgramming.knapsack;

public class diffSubset {
    public static void main(String[] args) {
        int[] arr={2 ,40, 6, 6, 43, 44, 10, 32, 12, 12, 26, 31, 48, 14, 38, 42, 25};
        int diff=2;
        System.out.println(subset(arr,diff));

    }
    static int subset(int[] arr, int diff){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int sum1=(sum+diff)/2;
        return subCount(arr,sum1,arr.length);
    }
    static int subCount(int[] arr, int sum, int n){
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

//{ Driver Code Starts
//Initial Template for Java





//class Solution{
//
//    public int countPartitions(int n, int d, int arr[]){
//        // Code herepublic int countPartitions(int n, int d, int arr[]){
//        int m=1000000000+7;
//        int sum=0;
//        for(int i:arr)
//            sum+=i;
//        sum=sum+d;
//        //sum+difference always be even
//        if(sum%2==1) return 0;
//        sum/=2;
//        int dp[][]=new int[n+1][sum+1];
//        for(int i=0;i<n+1;i++)
//            dp[i][0]=1;
//        for(int j=1;j<sum+1;j++)
//            dp[0][j]=0;
//        for(int i=1;i<n+1;i++)
//        {
//            for(int j=0;j<sum+1;j++)
//            {
//                if(arr[i-1]<=j)
//                {
//                    dp[i][j]=(dp[i-1][j-arr[i-1]]+dp[i-1][j])%m;
//                }
//                else
//                {
//                    dp[i][j]=dp[i-1][j]%m;
//                }
//            }
//        }
//        return dp[n][sum];
//
//    }
//
//}
