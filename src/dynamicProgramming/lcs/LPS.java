package dynamicProgramming.lcs;

public class LPS {
    public static void main(String[] args) {
        String str="letelt";
        System.out.println(lps(str));

    }
    static int lps(String a){
        String b=new StringBuilder(a).reverse().toString();
        int n=a.length();
        int[][] t=new int[n+1][n+1];
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                if(i==0||j==0)t[i][j]=0;
            }
        }

        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    t[i][j]=t[i-1][j-1]+1;
                }else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        return n-t[n][n];
    }
}
