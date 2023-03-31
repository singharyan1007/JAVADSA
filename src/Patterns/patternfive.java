package Patterns;

public class patternfive {
    public static void main(String[] args) {
pattern(9);
    }
    static void pattern(int n){
        int num=n/2;
        for(int i=1;i<=n;i++){
            if(i<=(num+1)){
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                int k=num;
               while(k>=1){
                    System.out.print("* ");
                    k--;
                }
               num--;
                System.out.println();
            }
        }
    }
}
