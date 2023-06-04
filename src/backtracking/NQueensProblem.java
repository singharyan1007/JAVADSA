package backtracking;

public class NQueensProblem {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        System.out.println(queens(board,0));

    }
    static int queens(boolean[][] board,int row){
        //if the row becomes equal to board.length then recursion hits
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        //placing the queen and checking for every row and col
        for(int col=0;col<board.length;col++){
            //checking if the cell is safe or not
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count+=queens(board,row+1);
                //now backtracking will take place, i.e. when we come out of the function call we revert the changes
                board[row][col]=false;
            }
        }
        return count;

    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //first check for the vertical row
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
                //means there is a queen over there
            }
        }
        //diagonal left
        int maxLeft=Math.min(row,col);
        for(int i=0;i<=maxLeft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        int maxRight=Math.min(row,board.length-col-1);
        for(int i=0;i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row:board){
            for(boolean element:row){
                if(element){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
