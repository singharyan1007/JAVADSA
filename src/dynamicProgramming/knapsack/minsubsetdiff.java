package dynamicProgramming.knapsack;

import java.util.ArrayList;

public class minsubsetdiff {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,7,10};
        int sum=24;
        System.out.println(subset(arr,sum,arr.length));

    }
    static int subset(int[]arr, int sum,int n ){
        boolean [][] t=new boolean[n+1][sum+1];

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
            for(int j=1;j<t[0].length;j++){
                if(arr[i-1]<=j){
                    t[i][j]=t[i-1][j]||t[i-1][j-arr[i-1]];
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }

       for(int i=0;i<t.length;i++){
           for(int j=0;j<t[0].length;j++){
               System.out.print(t[i][j]+" ");
           }
           System.out.println();
       }
       ArrayList<Integer> alist=new ArrayList<>();
       for(int i=0;i<t[n].length;i++){
           if(t[n][i]!=false){
               alist.add(i);
           }
       }
       int min=Integer.MAX_VALUE;
       for(int j=0;j<alist.size()/2;j++){
           min=Math.min(min,sum-2*alist.get(j));
       }
       return min;
    }
}
