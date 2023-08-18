package dynamicProgramming.unboundedKanpsack;

public class coinChangeProblemI {
    public static void main(String[] args) {
//        Coin Change Problem Maximum Number of ways
//        Given a value N, if we want to make change for N cents,
//        and we have infinite supply of each of S = { S1, S2, .. , Sm} valued coins,
//        how many ways can we make the change? The order of coins doesn’t matter.
//        Example:
//        for N = 4 and S = {1,2,3}, there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}. So output should be 4.

        int[] coins={1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };
        int sum=1000;
        int n=coins.length;
        System.out.println(countWays(coins,sum,n));
    }
    static int countWays(int[] coins, int sum,int n){
        int[][] t=new int[n+1][sum+1];
        for(int i=0;i<t.length;i++) {
            for (int j = 0; j < t[0].length; j++) {
                if(i==0){
                    t[i][j]=0;
                }
                if(j==0){
                    t[i][j]=1;

                }
            }
        }

        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                if(coins[i-1]<=j){
                    t[i][j]=t[i-1][j]+t[i][j-coins[i-1]];
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }

        return t[n][sum];
    }
}
