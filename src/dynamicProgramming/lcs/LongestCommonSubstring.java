package dynamicProgramming.lcs;

public class LongestCommonSubstring {
    int longestCommonSubstr(String S1, String S2, int n, int m){
        // code here
        int[][] t=new int[n+1][m+1];

        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                if(i==0||j==0){
                    t[i][j]=0;
                }
            }
        }

        int maxLength=0;


        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                if(S1.charAt(i-1)==S2.charAt(j-1)){
                    t[i][j]=t[i-1][j-1]+1;
                    maxLength=Math.max(maxLength,t[i][j]);
                }else{
                    t[i][j]=0;
                }
            }
        }
        return maxLength;
    }

}
