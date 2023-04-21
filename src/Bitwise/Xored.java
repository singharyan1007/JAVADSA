package Bitwise;

public class Xored {
    //XOR from 0 to a
    public static void main(String[] args) {
        int a=10;
        int s=0;
        for(int i=0;i<=a;i++){
            s=s^i;

        }
        System.out.println(1^4);
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
