package Patterns;

public class patternsone {
    public static void main(String[] args) {
patterns(4);
    }
    static void patterns(int n){
        for(int i=1;i<=n;i++){
            for(int col=1;col<=i;col++){
                System.out.print("* ");
                }
            System.out.println();
        }

    }
}
