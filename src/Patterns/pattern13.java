package Patterns;

public class pattern13 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.print("*");

            for(int k=0;k<2*i-1;k++){
                System.out.print(" ");
            }

            if(i==n-1){
                for(int l=0;l<2*i;l++){
                    System.out.print("*");
                }

            }else
                System.out.print("*");

            System.out.println();


        }

    }

}
