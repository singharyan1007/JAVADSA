package TikTacToe;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        char[][] board=new char[3][3];
       for(int i=0;i<board.length;i++){
           for(int j=0;j<board[0].length;j++){
               board[i][j]=' ';
           }
       }

       char player='X';
       boolean gameOver=false;
        Scanner scan=new Scanner(System.in);

        while(!gameOver){
            printBoard(board);
            System.out.println("Player "+player+" enter: ");
            int row=scan.nextInt();
            int col=scan.nextInt();
            System.out.println();
            if(board[row][col]==' '){
                board[row][col]=player;

                gameOver=haveWon(board,player);
                if(gameOver){
                    System.out.println("Player "+player+" has won");
                }else{
                    player=(player=='X')?'0':'X';
                }
            }else{
                System.out.println("Invalid move");
            }
        }
        printBoard(board);


    }

    private static boolean haveWon(char[][] board, char player) {
        for(int row=0;row<board.length;row++){
            if(board[row][0]==player && board[row][1]==player && board[row][2]==player){
                return true;
            }
        }

        for(int col=0;col<board[0].length;col++){
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;

    }

    private static void printBoard(char[][] board) {
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[0].length;col++){
                System.out.print(board[row][col]+" | ");
            }
            System.out.println();
        }
    }


}
