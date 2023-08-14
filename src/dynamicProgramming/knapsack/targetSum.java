package dynamicProgramming.knapsack;

public class targetSum {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1};
        int target=3;
        System.out.println(targetCount(arr,5,target));

    }
    static int targetCount(int[] arr,int n,int diff){
        int sum=0;
        for(int x:arr){
            sum+=x;

        }
        if((sum+diff)%2==1 ||diff>sum  ) return 0;
        //Important condition
        int s2=(sum+diff)/2;
        int[][] t=new int[n+1][s2+1];
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
        return t[n][s2];
    }
}
