package backtracking;

import java.util.ArrayList;

public class RatInAMaze {
    public static void main(String[] args) {

    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> ans=new ArrayList<>();
        String s="";
        int[][] visited=new int[n][n];
        if(m[0][0]==0){
            return ans;
        }
        findPaths(m,visited,s,ans,n,0,0);
        return ans;


    }
    static void findPaths(int[][]m,int[][]visited,String s, ArrayList<String> ans,int n,int r, int c){
        if(r==n-1 && c==n-1){
            ans.add(s);
            return;
        }else{
            visited[r][c]=1;
        }
        //down
        if(r+1<n && visited[r+1][c]==0 && m[r+1][c]==1){
            findPaths(m,visited,s+"D",ans,n,r+1,c);
        }
        if(r-1>=0 && visited[r-1][c]==0 && m[r-1][c]==1){
            findPaths(m,visited,s+"U",ans,n,r-1,c);
        }
        if(c+1<n && visited[r][c+1]==0 && m[r][c+1]==1){
            findPaths(m,visited,s+"R",ans,n,r,c+1);
        }
        if(c-1>=0 && visited[r][c-1]==0 && m[r][c-1]==1){
            findPaths(m,visited,s+"L",ans,n,r,c-1);
        }
        visited[r][c]=0;
    }
}
