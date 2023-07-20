package dynamicProgramming.unboundedKanpsack;

public class rodCuttingProblem {
    public static void main(String[] args) {
        int[] len={1,2,3,4,5,6,7,8};
        int[] price={1,5,8,9,10,17,17,20};
        int val=8;
        System.out.println(maxProfit(price,len,len.length,val));


    }

    static int maxProfit(int[] price, int[] len, int N, int val){
        int[][] t=new int[N+1][val+1];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i==0||j==0){
                    t[i][j]=0;
                }
            }
        }

        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                if(len[i-1]<=j){
                    t[i][j]=Math.max(price[i-1]+t[i][j-len[i-1]],t[i-1][j]);
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        }

        return t[N][val];

//        if(len[N-1]<=val){
//            return t[N][val]=Math.max(price[N-1]+t[N][val-len[N-1]],t[N-1][val]);
//        }
//        else{
//            return t[N][val]=t[N-1][val];
//        }
    }
}
