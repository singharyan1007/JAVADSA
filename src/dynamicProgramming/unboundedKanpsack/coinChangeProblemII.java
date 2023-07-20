package dynamicProgramming.unboundedKanpsack;

public class coinChangeProblemII {
    public static void main(String[] args) {
//        Given a value V, if we want to make change for V cents, and we have infinite supply of each of
//        C = { C1, C2, .. , Cm} valued coins, what is the minimum number of coins to make the change?
//        Example:
//
//        Input: coins[] = {25, 10, 5}, V = 30
//        Output: Minimum 2 coins required
//        We can use one coin of 25 cents and one of 5 cents
        int[]coins={25,10,5};
        int amount=30;
        System.out.println(minCoins(coins,amount,coins.length));
    }


    static int minCoins(int[] coins, int amount, int n){
        int [][]t=new int[n+1][amount+1];
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                if(j==0){
                    t[i][0]=0;
                }
                if(i==0 && j!=0){
                    t[0][j]=Integer.MAX_VALUE-1;

                }
                if(i==1 && j!=0){
                    if(j%coins[0]==0){
                        t[1][j]=j/coins[0];
                    }
                    else t[1][j]=Integer.MAX_VALUE-1;
                }
            }
        }
        for (int i=2;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                if(coins[i-1]<=j){
                    t[i][j]=Math.min(t[i][j-coins[i-1]]+1,t[i-1][j]);
                }else{
                    t[i][j]=-1;
                }
            }
        }
        return t[n][amount];


//        Leetcode solution
//        for(int j=1;j<amount+1;j++){
//            if(j%coins[0]==0){
//                t[1][j]=j/coins[0];
//            }else{
//                t[1][j]=Integer.MAX_VALUE-1;
//            }
//        }
//
//        for(int i=2;i<t.length;i++){
//            for(int j=1;j<t[0].length;j++){
//                if(coins[i-1]<=j){
//                    t[i][j]=Math.min(t[i][j-coins[i-1]]+1,t[i-1][j]);
//                }else{
//                    t[i][j]=t[i-1][j];
//                }
//            }
//        }
//        if(t[n][amount]!=Integer.MAX_VALUE-1){
//            return t[n][amount];
//        }else{
//            return -1;
//        }

    }
}
