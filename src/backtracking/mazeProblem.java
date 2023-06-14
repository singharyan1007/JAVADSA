package backtracking;

import java.util.ArrayList;

public class mazeProblem {
    public static void main(String[] args) {
        System.out.println(count(3,3));
//        path("",3,3);
//        System.out.println(pathRet("",3,3));
//        System.out.println(pathDig("",3,3));
//        boolean[][] board={
//                {true,true,true},
//                {true,false,true},
//                {true,true,true}
//        };
//        pathRestrictions("",board,0,0);
    }
    static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);
        return left+right;
    }
    // printing the path using the same concept of processed and unprocessed
    static void path(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+"D",r-1,c);
        }if(c>1){
            path(p+'R',r,c-1);
        }
    }
    static ArrayList<String> pathRet(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> alist=new ArrayList<>();
            alist.add(p);
            return alist;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(r>1){
            ans.addAll(pathRet(p+'D',r-1,c));
        }
        if(c>1){
            ans.addAll(pathRet(p+'R',r,c-1));
        }
        return ans;

    }
    //also can include the diagonal paths
    static ArrayList<String> pathDig(String p, int r, int c ){
        if(r==1 && c==1){
            ArrayList<String> alist=new ArrayList<>();
            alist.add(p);
            return alist;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(r>1 && c>1){
            ans.addAll(pathDig(p+'D',r-1,c-1));

        }
        if(r>1){
            ans.addAll(pathDig(p+'V',r-1,c));
        }
        if(c>1){
            ans.addAll(pathDig(p+'H',r,c-1));
        }
        return ans;
    }

    // maze with obstacles - simply end the particular recursion call
    static void pathRestrictions(String p, boolean[][] maze,int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            pathRestrictions(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            pathRestrictions(p+'R',maze,r,c+1);
        }
    }

}
