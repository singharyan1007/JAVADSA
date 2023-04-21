package arrays;

public class Spiral2 {
    public static void main(String[] args) {

    }
    static int[][] generateMatrix(int n){
        int[][] arr=new int[n][n];
        int rowBegin=0;
        int rowEnd=n-1;
        int colBegin=0;
        int colEnd=n-1;
        int count=1;

        while(rowBegin<=rowEnd && colBegin<=colEnd){



            for(int i=colBegin;i<=colEnd;i++){
                arr[rowBegin][i]=count;
                count++;
            }
            rowBegin++;
            for(int i=rowBegin;i<=rowEnd;i++){
                arr[i][colEnd]=count;
                count++;
            }
            colEnd--;
            if(rowBegin<=rowEnd){
                for(int i=colEnd;i>=colBegin;i--){
                    arr[rowEnd][i]=count;
                    count++;
                }

            }
            rowEnd--;
            if(colBegin<=colEnd){
                for(int i=rowEnd;i>=rowBegin;i--){
                    arr[i][colBegin]=count;
                }
            }
            colBegin++;
        }
        return arr;

    }
}
