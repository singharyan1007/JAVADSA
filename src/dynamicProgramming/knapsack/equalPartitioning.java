package dynamicProgramming.knapsack;

public class equalPartitioning {
    public static void main(String[] args) {
        int[] arr={1,2,5};
        int sum=4;
        System.out.println(equalpar(arr,sum,arr.length));

    }
    static boolean equalpar(int[] arr, int sum, int n){
        boolean[][] t=new boolean[n+1][sum+1];
        int val=0;
        for(int i=0;i<arr.length;i++){
            val+=arr[i];
        }
        if(val%2!=0){
            return false;
        }
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                if(i==0){
                    t[0][j]=false;
                }
                if(j==0){
                    t[i][0]=true;
                }
            }
        }


        for(int i=1;i<t.length;i++){
            for(int j=1;j<=t[0].length;j++){
                if(arr[i-1]<=j){
                    t[i][j]=t[i][j-arr[i-1]]||t[i-1][j];
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
}
