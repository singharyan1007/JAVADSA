package dynamicProgramming.lcs;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        String s1 = "babad";
        String s2 = "dabab";

        System.out.println("The Longest Common Supersequence is "+longestCommonSubstr(s1,s2,s1.length(),s2.length()));
    }
    static String longestCommonSubstr(String S1, String S2, int n, int m){
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
//        return maxLength;

        int len=maxLength;
        int i=n;
        int j=m;

        int index = len-1;
        String str="";
        for(int k=1; k<=len;k++){
            str +="$"; // dummy string
        }
        StringBuilder ss= new StringBuilder(S1);
        StringBuilder str2=new StringBuilder(str);
        while(i>0 && j>0){
            if(ss.charAt(i-1) == S2.charAt(j-1)){
                str2.setCharAt(index,ss.charAt(i-1) );
                index--;
                i--;
                j--;
            }
            else if(ss.charAt(i-1)>S2.charAt(j-1)){
                i--;
            }
            else j--;
        }
        return str2.toString();
    }

}
