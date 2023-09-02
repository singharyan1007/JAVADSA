package dynamicProgramming.lcs;

public class PrintingLCS {
    public static void main(String[] args) {

        String s1= "abcde";
        String s2= "bdgek";

        System.out.print("The Longest Common Subsequence is ");
        lcs(s1,s2);
    }
    static void lcs(String s1, String s2){
        int n=s1.length();
        int m=s2.length();


        int[][] t=new int[n+1][m+1];
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                if(i==0||j==0){
                    t[i][j]=0;
                }
            }
        }

        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }else{
                    t[i][j]=0+Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }

        int len=t[n][m];
        int i=n;
        int j=m;

        int index = len-1;
        String str="";
        for(int k=1; k<=len;k++){
            str +="$"; // dummy string
        }
        StringBuilder ss= new StringBuilder(s1);
        StringBuilder str2=new StringBuilder(str);
        while(i>0 && j>0){
            if(ss.charAt(i-1) == s2.charAt(j-1)){
                str2.setCharAt(index,ss.charAt(i-1) );
                index--;
                i--;
                j--;
            }
            else if(ss.charAt(i-1)>s2.charAt(j-1)){
                i--;
            }
            else j--;
        }
        System.out.println(str2);
    }
}
