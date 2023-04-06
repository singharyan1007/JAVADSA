package Recursion;

public class MinElement {
    public static void main(String[] args) {
        int[] arr={1,4,45,5,-50,10,2};
        int n=arr.length;
        System.out.println(minvalue(arr,n));

    }
    static  int minvalue(int[] arr,int n){
        if(n==1)
            return  arr[0];

        return Math.min(arr[n-1],minvalue(arr,n-1));



    }
}
