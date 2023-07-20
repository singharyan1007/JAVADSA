package dynamicProgramming.knapsack;

public class kanpsack01 {
    public static void main(String[] args) {
        int[] wt={10, 20, 30};
        int[] val={60, 100, 120 };
        int w=50;
        System.out.println(knap(wt,val,3,50));
        System.out.println(knapDp(wt,val,3,w));
        System.out.println(knaprecur(wt,val,3,w));

    }

//    Recursive approach
    static int knaprecur(int[] wt, int[] val,int n,int w){
        if(n==0||w==0){
            return 0;
        }
        if(wt[n-1]<=w){
            return Math.max(val[n-1]+knaprecur(wt,val,n-1,w-wt[n-1]),knaprecur(wt,val,n-1,w));
        }else{
            return knaprecur(wt,val,n-1,w);
        }

    }



    static int[][] t=new int[4][51];
    static int knap(int[] wt, int[] val,int n, int w){
        for(int row=0;row<t.length;row++){
            for(int col=0;col<t[0].length;col++){
                t[row][col]=-1;
            }
        }
        return knapsack(wt,val,n,w);
    }
    //This is memoized approach(Top-down)
    static int knapsack(int[] wt, int[] val,int n, int w){
        if(n==0 || w==0){
            return 0;
        }
        if(t[n][w]!=-1){
            return t[n][w];
        }
        if(wt[n-1]<=w){
            return t[n][w]= Math.max(val[n-1]+knapsack(wt,val,n-1,w-wt[n-1]),knapsack(wt,val,n-1,w));
        }else{
            return t[n][w]=knapsack(wt,val,n-1,w);
        }
    }

    //BOTTOM-UP approach
    static int knapDp(int[] wt, int[] val, int n, int w){
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++ ){
                if(i==0||j==0){
                    t[i][j]=0;
                    //this is the initialisation of the bottom up matrix
                }
            }
        }
        //in DP we convert the recursive function call to iteration
        //so
        if(wt[n-1]<=w){
            return t[n][w]=Math.max(val[n-1]+t[n-1][w-wt[n-1]],t[n-1][w]);
        }
        else {
            return t[n][w]=t[n-1][w];
        }
    }
}
