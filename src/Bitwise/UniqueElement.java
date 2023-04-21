package Bitwise;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr={2,3,3,2,4,6,4};
        System.out.println(unique(arr));
    }
    static int unique(int[] arr){
        int u=0;
        for(int num:arr){
            u^=num;
        }
        return u;
    }
}
