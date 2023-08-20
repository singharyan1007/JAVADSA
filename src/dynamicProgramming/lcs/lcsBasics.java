package dynamicProgramming.lcs;

public class lcsBasics {
    public static void main(String[] args) {
        String s1="abcdgh";
        int x=s1.length();
        String s2="abedfhr";
        int y=s2.length();

//        System.out.println(longestCommonSubsequence(s1,s2));

    }
    //recursive solution- gives TLE
//    static int lcs(int x, int y, String s1, String s2)
//    {
//        // your code here
//        if(x==0||y==0){
//            return 0;
//        }
//        if(s1.charAt(x-1)==s2.charAt(y-1)){
//            return 1+lcs(x-1,y-1,s1,s2);
//        }
//        return max(lcs(x, y-1, s1, s2),
//                lcs(x-1, y, s1, s2));
//    }
//
//    static int max(int a, int b) { return (a > b) ? a : b; }



    //Memoization solution(Bottom up approach)

//    public static int longestCommonSubsequence(String text1, String text2) {
//        for(int i=0;i<t.length;i++){
//            for(int j=0;j<t[0].length;j++){
//                t[i][j]=-1;
//            }
//        }
//        int n=text1.length();
//        int m=text2.length();
//        return lcs(n,m,text1,text2);
//    }
//    static int[][] t=new int[1001][1001];
//
//    static int lcs(int n, int m, String s1, String s2){
//        if(n==0||m==0){
//            return 0;
//        }
//        if(t[n][m]!=-1){
//            return t[n][m];
//        }
//        if(s1.charAt(n-1)==s2.charAt(m-1)){
//            return t[n][m]= 1+lcs(n-1,m-1,s1,s2);
//        }
//        return t[n][m]= max(lcs(n, m-1, s1, s2),
//                lcs(n-1, m, s1, s2));
//    }
//    static int max(int a, int b) { return (a > b) ? a : b; }




//     TOP DOWN APPROACH
public int longestCommonSubsequence(String text1, String text2) {
    for(int i=0;i<t.length;i++){
        for(int j=0;j<t[0].length;j++){
            t[i][j]=-1;
        }
    }
    int n=text1.length();
    int m=text2.length();
    return lcs(n,m,text1,text2);
}
    static int[][] t=new int[1001][1001];

    static int lcs(int n, int m, String s1, String s2){
        if(n==0||m==0){
            return 0;
        }
        if(t[n][m]!=-1){
            return t[n][m];
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return t[n][m]= 1+lcs(n-1,m-1,s1,s2);
        }
        return t[n][m]= max(lcs(n, m-1, s1, s2),
                lcs(n-1, m, s1, s2));
    }
    static int max(int a, int b) { return (a > b) ? a : b; }

}
