package Bitwise;

public class XorInRange {
    public static void main(String[] args) {
        //so for xor in range xor(b) ^ xor(a-1);
        int sum=xor(9)^xor(2);
        System.out.println(sum);
    }
    static int xor(int a){
        if(a%4==0){
            return a;
        }else if(a%4==1){
            return 1;

        }else if(a%4==2){
            return a+1;
        }
        return 0;
    }
}
